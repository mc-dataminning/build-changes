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

public class edk extends eds {
   public static final Codec<edk> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(efu.a.fieldOf("source").forGetter($$0x -> $$0x.b), edk.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, edk::new)
   );
   private final eft b;
   private final List<edk.b> c;

   edk(List<eff> $$0, eft $$1, List<edk.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public edu b() {
      return edv.w;
   }

   @Override
   public Set<eeo<?>> a() {
      return this.b.b();
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      rk $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::w, $$2));
      }

      return $$0;
   }

   public static edk.a a(eft $$0) {
      return new edk.a($$0);
   }

   public static edk.a a(ecg.b $$0) {
      return new edk.a(efr.a($$0));
   }

   public static class a extends eds.a<edk.a> {
      private final eft a;
      private final List<edk.b> b = Lists.newArrayList();

      a(eft $$0) {
         this.a = $$0;
      }

      public edk.a a(String $$0, String $$1, edk.c $$2) {
         try {
            this.b.add(new edk.b(edk.d.a($$0), edk.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public edk.a a(String $$0, String $$1) {
         return this.a($$0, $$1, edk.c.a);
      }

      protected edk.a a() {
         return this;
      }

      @Override
      public edt b() {
         return new edk(this.g(), this.a, this.b);
      }
   }

   static record b(edk.d b, edk.d c, edk.c d) {
      public static final Codec<edk.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  edk.d.a.fieldOf("source").forGetter(edk.b::a), edk.d.a.fieldOf("target").forGetter(edk.b::b), edk.c.d.fieldOf("op").forGetter(edk.b::c)
               )
               .apply($$0, edk.b::new)
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

      public edk.d a() {
         return this.b;
      }

      public edk.d b() {
         return this.c;
      }

      public edk.c c() {
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

      public static final Codec<edk.c> d = ash.a(edk.c::values);
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
      public static final Codec<edk.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, edk.d::a);

      public static edk.d a(String $$0) throws CommandSyntaxException {
         eh.g $$1 = new eh().a(new StringReader($$0));
         return new edk.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public eh.g b() {
         return this.c;
      }
   }
}
