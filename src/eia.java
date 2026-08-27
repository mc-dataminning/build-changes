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

public class eia extends eii {
   public static final Codec<eia> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ekk.a.fieldOf("source").forGetter($$0x -> $$0x.b), eia.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, eia::new)
   );
   private final ekj b;
   private final List<eia.b> c;

   eia(List<ejv> $$0, ekj $$1, List<eia.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eik b() {
      return eil.w;
   }

   @Override
   public Set<eje<?>> a() {
      return this.b.b();
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      tk $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::w, $$2));
      }

      return $$0;
   }

   public static eia.a a(ekj $$0) {
      return new eia.a($$0);
   }

   public static eia.a a(egw.b $$0) {
      return new eia.a(ekh.a($$0));
   }

   public static class a extends eii.a<eia.a> {
      private final ekj a;
      private final List<eia.b> b = Lists.newArrayList();

      a(ekj $$0) {
         this.a = $$0;
      }

      public eia.a a(String $$0, String $$1, eia.c $$2) {
         try {
            this.b.add(new eia.b(eia.d.a($$0), eia.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public eia.a a(String $$0, String $$1) {
         return this.a($$0, $$1, eia.c.a);
      }

      protected eia.a a() {
         return this;
      }

      @Override
      public eij b() {
         return new eia(this.g(), this.a, this.b);
      }
   }

   static record b(eia.d b, eia.d c, eia.c d) {
      public static final Codec<eia.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eia.d.a.fieldOf("source").forGetter(eia.b::a), eia.d.a.fieldOf("target").forGetter(eia.b::b), eia.c.d.fieldOf("op").forGetter(eia.b::c)
               )
               .apply($$0, eia.b::new)
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

      public eia.d a() {
         return this.b;
      }

      public eia.d b() {
         return this.c;
      }

      public eia.c c() {
         return this.d;
      }
   }

   public static enum c implements avk {
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

      public static final Codec<eia.c> d = avk.a(eia.c::values);
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
      public static final Codec<eia.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, eia.d::a);

      public static eia.d a(String $$0) throws CommandSyntaxException {
         ek.g $$1 = new ek().a(new StringReader($$0));
         return new eia.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public ek.g b() {
         return this.c;
      }
   }
}
