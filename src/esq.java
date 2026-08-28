import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableObject;

public class esq extends etc {
   public static final MapCodec<esq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evp.a.fieldOf("source").forGetter($$0x -> $$0x.b), esq.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, esq::new)
   );
   private final evo b;
   private final List<esq.b> c;

   esq(List<eva> $$0, evo $$1, List<esq.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public ete<esq> b() {
      return etf.C;
   }

   @Override
   public Set<eui<?>> a() {
      return this.b.b();
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      uy $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<ub> $$3 = new MutableObject();
         Supplier<uy> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kq.b, cxh.a).c());
            }

            return (uy)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         ub $$5 = (ub)$$3.getValue();
         if ($$5 != null) {
            cxh.a(kq.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static esq.a a(evo $$0) {
      return new esq.a($$0);
   }

   public static esq.a a(erp.b $$0) {
      return new esq.a(evm.a($$0));
   }

   public static class a extends etc.a<esq.a> {
      private final evo a;
      private final List<esq.b> b = Lists.newArrayList();

      a(evo $$0) {
         this.a = $$0;
      }

      public esq.a a(String $$0, String $$1, esq.c $$2) {
         try {
            this.b.add(new esq.b(fl.g.a($$0), fl.g.a($$1), $$2));
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
      public etd b() {
         return new esq(this.g(), this.a, this.b);
      }
   }

   static record b(fl.g b, fl.g c, esq.c d) {
      public static final Codec<esq.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fl.g.a.fieldOf("source").forGetter(esq.b::a), fl.g.a.fieldOf("target").forGetter(esq.b::b), esq.c.d.fieldOf("op").forGetter(esq.b::c))
               .apply($$0, esq.b::new)
      );

      public void a(Supplier<uy> $$0, uy $$1) {
         try {
            List<uy> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public fl.g a() {
         return this.b;
      }

      public fl.g b() {
         return this.c;
      }

      public esq.c c() {
         return this.d;
      }
   }

   public static enum c implements azk {
      a("replace") {
         @Override
         public void a(uy $$0, fl.g $$1, List<uy> $$2) throws CommandSyntaxException {
            $$1.a($$0, (uy)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(uy $$0, fl.g $$1, List<uy> $$2) throws CommandSyntaxException {
            List<uy> $$3 = $$1.a($$0, uh::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof uh) {
                  $$2.forEach($$1xx -> ((uh)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(uy $$0, fl.g $$1, List<uy> $$2) throws CommandSyntaxException {
            List<uy> $$3 = $$1.a($$0, ub::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ub) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof ub) {
                        ((ub)$$1x).a((ub)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<esq.c> d = azk.a(esq.c::values);
      private final String e;

      public abstract void a(uy var1, fl.g var2, List<uy> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
