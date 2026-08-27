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

public class ehz extends eih {
   public static final Codec<ehz> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ekj.a.fieldOf("source").forGetter($$0x -> $$0x.b), ehz.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, ehz::new)
   );
   private final eki b;
   private final List<ehz.b> c;

   ehz(List<eju> $$0, eki $$1, List<ehz.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eij b() {
      return eik.w;
   }

   @Override
   public Set<ejd<?>> a() {
      return this.b.b();
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      tk $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::w, $$2));
      }

      return $$0;
   }

   public static ehz.a a(eki $$0) {
      return new ehz.a($$0);
   }

   public static ehz.a a(egv.b $$0) {
      return new ehz.a(ekg.a($$0));
   }

   public static class a extends eih.a<ehz.a> {
      private final eki a;
      private final List<ehz.b> b = Lists.newArrayList();

      a(eki $$0) {
         this.a = $$0;
      }

      public ehz.a a(String $$0, String $$1, ehz.c $$2) {
         try {
            this.b.add(new ehz.b(ehz.d.a($$0), ehz.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public ehz.a a(String $$0, String $$1) {
         return this.a($$0, $$1, ehz.c.a);
      }

      protected ehz.a a() {
         return this;
      }

      @Override
      public eii b() {
         return new ehz(this.g(), this.a, this.b);
      }
   }

   static record b(ehz.d b, ehz.d c, ehz.c d) {
      public static final Codec<ehz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ehz.d.a.fieldOf("source").forGetter(ehz.b::a), ehz.d.a.fieldOf("target").forGetter(ehz.b::b), ehz.c.d.fieldOf("op").forGetter(ehz.b::c)
               )
               .apply($$0, ehz.b::new)
      );

      public void a(Supplier<tk> $$0, tk $$1) {
         try {
            List<tk> $$2 = this.b.b().a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c.b(), $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public ehz.d a() {
         return this.b;
      }

      public ehz.d b() {
         return this.c;
      }

      public ehz.c c() {
         return this.d;
      }
   }

   public static enum c implements avj {
      a("replace") {
         @Override
         public void a(tk $$0, ek.g $$1, List<tk> $$2) throws CommandSyntaxException {
            $$1.a($$0, (tk)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(tk $$0, ek.g $$1, List<tk> $$2) throws CommandSyntaxException {
            List<tk> $$3 = $$1.a($$0, st::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof st) {
                  $$2.forEach($$1xx -> ((st)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(tk $$0, ek.g $$1, List<tk> $$2) throws CommandSyntaxException {
            List<tk> $$3 = $$1.a($$0, sn::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof sn) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof sn) {
                        ((sn)$$1x).a((sn)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<ehz.c> d = avj.a(ehz.c::values);
      private final String e;

      public abstract void a(tk var1, ek.g var2, List<tk> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   static record d(String b, ek.g c) {
      public static final Codec<ehz.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, ehz.d::a);

      public static ehz.d a(String $$0) throws CommandSyntaxException {
         ek.g $$1 = new ek().a(new StringReader($$0));
         return new ehz.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public ek.g b() {
         return this.c;
      }
   }
}
