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

public class ely extends emg {
   public static final Codec<ely> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eoi.a.fieldOf("source").forGetter($$0x -> $$0x.b), ely.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, ely::new)
   );
   private final eoh b;
   private final List<ely.b> c;

   ely(List<ent> $$0, eoh $$1, List<ely.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public emi b() {
      return emj.w;
   }

   @Override
   public Set<enc<?>> a() {
      return this.b.b();
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      tx $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::x, $$2));
      }

      return $$0;
   }

   public static ely.a a(eoh $$0) {
      return new ely.a($$0);
   }

   public static ely.a a(eku.b $$0) {
      return new ely.a(eof.a($$0));
   }

   public static class a extends emg.a<ely.a> {
      private final eoh a;
      private final List<ely.b> b = Lists.newArrayList();

      a(eoh $$0) {
         this.a = $$0;
      }

      public ely.a a(String $$0, String $$1, ely.c $$2) {
         try {
            this.b.add(new ely.b(ely.d.a($$0), ely.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public ely.a a(String $$0, String $$1) {
         return this.a($$0, $$1, ely.c.a);
      }

      protected ely.a a() {
         return this;
      }

      @Override
      public emh b() {
         return new ely(this.g(), this.a, this.b);
      }
   }

   static record b(ely.d b, ely.d c, ely.c d) {
      public static final Codec<ely.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ely.d.a.fieldOf("source").forGetter(ely.b::a), ely.d.a.fieldOf("target").forGetter(ely.b::b), ely.c.d.fieldOf("op").forGetter(ely.b::c)
               )
               .apply($$0, ely.b::new)
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

      public ely.d a() {
         return this.b;
      }

      public ely.d b() {
         return this.c;
      }

      public ely.c c() {
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

      public static final Codec<ely.c> d = axq.a(ely.c::values);
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
      public static final Codec<ely.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, ely.d::a);

      public static ely.d a(String $$0) throws CommandSyntaxException {
         em.g $$1 = new em().a(new StringReader($$0));
         return new ely.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public em.g b() {
         return this.c;
      }
   }
}
