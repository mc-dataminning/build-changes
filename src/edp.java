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

public class edp extends edx {
   public static final Codec<edp> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(efz.a.fieldOf("source").forGetter($$0x -> $$0x.b), edp.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, edp::new)
   );
   private final efy b;
   private final List<edp.b> c;

   edp(List<efk> $$0, efy $$1, List<edp.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public edz b() {
      return eea.w;
   }

   @Override
   public Set<eet<?>> a() {
      return this.b.b();
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      rn $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::w, $$2));
      }

      return $$0;
   }

   public static edp.a a(efy $$0) {
      return new edp.a($$0);
   }

   public static edp.a a(ecl.b $$0) {
      return new edp.a(efw.a($$0));
   }

   public static class a extends edx.a<edp.a> {
      private final efy a;
      private final List<edp.b> b = Lists.newArrayList();

      a(efy $$0) {
         this.a = $$0;
      }

      public edp.a a(String $$0, String $$1, edp.c $$2) {
         try {
            this.b.add(new edp.b(edp.d.a($$0), edp.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public edp.a a(String $$0, String $$1) {
         return this.a($$0, $$1, edp.c.a);
      }

      protected edp.a a() {
         return this;
      }

      @Override
      public edy b() {
         return new edp(this.g(), this.a, this.b);
      }
   }

   static record b(edp.d b, edp.d c, edp.c d) {
      public static final Codec<edp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  edp.d.a.fieldOf("source").forGetter(edp.b::a), edp.d.a.fieldOf("target").forGetter(edp.b::b), edp.c.d.fieldOf("op").forGetter(edp.b::c)
               )
               .apply($$0, edp.b::new)
      );

      public void a(Supplier<rn> $$0, rn $$1) {
         try {
            List<rn> $$2 = this.b.b().a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c.b(), $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public edp.d a() {
         return this.b;
      }

      public edp.d b() {
         return this.c;
      }

      public edp.c c() {
         return this.d;
      }
   }

   public static enum c implements ask {
      a("replace") {
         @Override
         public void a(rn $$0, ej.g $$1, List<rn> $$2) throws CommandSyntaxException {
            $$1.a($$0, (rn)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(rn $$0, ej.g $$1, List<rn> $$2) throws CommandSyntaxException {
            List<rn> $$3 = $$1.a($$0, ra::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ra) {
                  $$2.forEach($$1xx -> ((ra)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(rn $$0, ej.g $$1, List<rn> $$2) throws CommandSyntaxException {
            List<rn> $$3 = $$1.a($$0, qu::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof qu) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof qu) {
                        ((qu)$$1x).a((qu)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<edp.c> d = ask.a(edp.c::values);
      private final String e;

      public abstract void a(rn var1, ej.g var2, List<rn> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   static record d(String b, ej.g c) {
      public static final Codec<edp.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, edp.d::a);

      public static edp.d a(String $$0) throws CommandSyntaxException {
         ej.g $$1 = new ej().a(new StringReader($$0));
         return new edp.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public ej.g b() {
         return this.c;
      }
   }
}
