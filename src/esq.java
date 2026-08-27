import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableObject;

public class esq extends eta {
   public static final Codec<esq> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(evk.a.fieldOf("source").forGetter($$0x -> $$0x.b), esq.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, esq::new)
   );
   private final evj b;
   private final List<esq.b> c;

   esq(List<euu> $$0, evj $$1, List<esq.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public etc b() {
      return etd.z;
   }

   @Override
   public Set<eud<?>> a() {
      return this.b.b();
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      vh $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<uk> $$3 = new MutableObject();
         Supplier<vh> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(ke.a, cxf.a).c());
            }

            return (vh)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         uk $$5 = (uk)$$3.getValue();
         if ($$5 != null) {
            cxf.a(ke.a, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static esq.a a(evj $$0) {
      return new esq.a($$0);
   }

   public static esq.a a(erp.b $$0) {
      return new esq.a(evh.a($$0));
   }

   public static class a extends eta.a<esq.a> {
      private final evj a;
      private final List<esq.b> b = Lists.newArrayList();

      a(evj $$0) {
         this.a = $$0;
      }

      public esq.a a(String $$0, String $$1, esq.c $$2) {
         try {
            this.b.add(new esq.b(ez.g.a($$0), ez.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public esq.a a(String $$0, String $$1) {
         return this.a($$0, $$1, esq.c.a);
      }

      protected esq.a a() {
         return this;
      }

      @Override
      public etb b() {
         return new esq(this.g(), this.a, this.b);
      }
   }

   static record b(ez.g b, ez.g c, esq.c d) {
      public static final Codec<esq.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ez.g.a.fieldOf("source").forGetter(esq.b::a), ez.g.a.fieldOf("target").forGetter(esq.b::b), esq.c.d.fieldOf("op").forGetter(esq.b::c))
               .apply($$0, esq.b::new)
      );

      public void a(Supplier<vh> $$0, vh $$1) {
         try {
            List<vh> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public ez.g a() {
         return this.b;
      }

      public ez.g b() {
         return this.c;
      }

      public esq.c c() {
         return this.d;
      }
   }

   public static enum c implements azg {
      a("replace") {
         @Override
         public void a(vh $$0, ez.g $$1, List<vh> $$2) throws CommandSyntaxException {
            $$1.a($$0, (vh)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(vh $$0, ez.g $$1, List<vh> $$2) throws CommandSyntaxException {
            List<vh> $$3 = $$1.a($$0, uq::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof uq) {
                  $$2.forEach($$1xx -> ((uq)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(vh $$0, ez.g $$1, List<vh> $$2) throws CommandSyntaxException {
            List<vh> $$3 = $$1.a($$0, uk::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof uk) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof uk) {
                        ((uk)$$1x).a((uk)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<esq.c> d = azg.a(esq.c::values);
      private final String e;

      public abstract void a(vh var1, ez.g var2, List<vh> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
