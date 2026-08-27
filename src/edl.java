import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class edl extends edt {
   public static final Codec<edl> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(efv.a.fieldOf("source").forGetter($$0x -> $$0x.b), edl.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, edl::new)
   );
   private final efu b;
   private final List<edl.b> c;

   edl(List<efg> $$0, efu $$1, List<edl.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public edv b() {
      return edw.w;
   }

   @Override
   public Set<eep<?>> a() {
      return this.b.b();
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      rk $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::w, $$2));
      }

      return $$0;
   }

   public static edl.a a(efu $$0) {
      return new edl.a($$0);
   }

   public static edl.a a(ech.b $$0) {
      return new edl.a(efs.a($$0));
   }

   public static class a extends edt.a<edl.a> {
      private final efu a;
      private final List<edl.b> b = Lists.newArrayList();

      a(efu $$0) {
         this.a = $$0;
      }

      public edl.a a(String $$0, String $$1, edl.c $$2) {
         try {
            this.b.add(new edl.b(edl.d.a($$0), edl.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public edl.a a(String $$0, String $$1) {
         return this.a($$0, $$1, edl.c.a);
      }

      protected edl.a a() {
         return this;
      }

      @Override
      public edu b() {
         return new edl(this.g(), this.a, this.b);
      }
   }

   static record b(edl.d b, edl.d c, edl.c d) {
      public static final Codec<edl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  edl.d.a.fieldOf("source").forGetter(edl.b::a), edl.d.a.fieldOf("target").forGetter(edl.b::b), edl.c.d.fieldOf("op").forGetter(edl.b::c)
               )
               .apply($$0, edl.b::new)
      );

      public void a(Supplier<rk> $$0, rk $$1) {
         try {
            List<rk> $$2 = this.b.b().a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c.b(), $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public edl.d a() {
         return this.b;
      }

      public edl.d b() {
         return this.c;
      }

      public edl.c c() {
         return this.d;
      }
   }

   public static enum c implements ash {
      a("replace") {
         @Override
         public void a(rk $$0, eh.g $$1, List<rk> $$2) throws CommandSyntaxException {
            $$1.a($$0, (rk)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(rk $$0, eh.g $$1, List<rk> $$2) throws CommandSyntaxException {
            List<rk> $$3 = $$1.a($$0, qx::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof qx) {
                  $$2.forEach($$1xx -> ((qx)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(rk $$0, eh.g $$1, List<rk> $$2) throws CommandSyntaxException {
            List<rk> $$3 = $$1.a($$0, qr::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof qr) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof qr) {
                        ((qr)$$1x).a((qr)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<edl.c> d = ash.a(edl.c::values);
      private final String e;

      public abstract void a(rk var1, eh.g var2, List<rk> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   static record d(String b, eh.g c) {
      public static final Codec<edl.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, edl.d::a);

      public static edl.d a(String $$0) throws CommandSyntaxException {
         eh.g $$1 = new eh().a(new StringReader($$0));
         return new edl.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public eh.g b() {
         return this.c;
      }
   }
}
