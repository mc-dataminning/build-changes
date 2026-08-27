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

public class ema extends emi {
   public static final Codec<ema> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eok.a.fieldOf("source").forGetter($$0x -> $$0x.b), ema.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, ema::new)
   );
   private final eoj b;
   private final List<ema.b> c;

   ema(List<env> $$0, eoj $$1, List<ema.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public emk b() {
      return eml.w;
   }

   @Override
   public Set<ene<?>> a() {
      return this.b.b();
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      tx $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::x, $$2));
      }

      return $$0;
   }

   public static ema.a a(eoj $$0) {
      return new ema.a($$0);
   }

   public static ema.a a(ekw.b $$0) {
      return new ema.a(eoh.a($$0));
   }

   public static class a extends emi.a<ema.a> {
      private final eoj a;
      private final List<ema.b> b = Lists.newArrayList();

      a(eoj $$0) {
         this.a = $$0;
      }

      public ema.a a(String $$0, String $$1, ema.c $$2) {
         try {
            this.b.add(new ema.b(ema.d.a($$0), ema.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public ema.a a(String $$0, String $$1) {
         return this.a($$0, $$1, ema.c.a);
      }

      protected ema.a a() {
         return this;
      }

      @Override
      public emj b() {
         return new ema(this.g(), this.a, this.b);
      }
   }

   static record b(ema.d b, ema.d c, ema.c d) {
      public static final Codec<ema.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ema.d.a.fieldOf("source").forGetter(ema.b::a), ema.d.a.fieldOf("target").forGetter(ema.b::b), ema.c.d.fieldOf("op").forGetter(ema.b::c)
               )
               .apply($$0, ema.b::new)
      );

      public void a(Supplier<tx> $$0, tx $$1) {
         try {
            List<tx> $$2 = this.b.b().a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c.b(), $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public ema.d a() {
         return this.b;
      }

      public ema.d b() {
         return this.c;
      }

      public ema.c c() {
         return this.d;
      }
   }

   public static enum c implements axq {
      a("replace") {
         @Override
         public void a(tx $$0, em.g $$1, List<tx> $$2) throws CommandSyntaxException {
            $$1.a($$0, (tx)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(tx $$0, em.g $$1, List<tx> $$2) throws CommandSyntaxException {
            List<tx> $$3 = $$1.a($$0, tg::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof tg) {
                  $$2.forEach($$1xx -> ((tg)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(tx $$0, em.g $$1, List<tx> $$2) throws CommandSyntaxException {
            List<tx> $$3 = $$1.a($$0, ta::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ta) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof ta) {
                        ((ta)$$1x).a((ta)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<ema.c> d = axq.a(ema.c::values);
      private final String e;

      public abstract void a(tx var1, em.g var2, List<tx> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   static record d(String b, em.g c) {
      public static final Codec<ema.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, ema.d::a);

      public static ema.d a(String $$0) throws CommandSyntaxException {
         em.g $$1 = new em().a(new StringReader($$0));
         return new ema.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public em.g b() {
         return this.c;
      }
   }
}
