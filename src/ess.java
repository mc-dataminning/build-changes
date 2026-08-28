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

public class ess extends ete {
   public static final MapCodec<ess> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evr.a.fieldOf("source").forGetter($$0x -> $$0x.b), ess.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, ess::new)
   );
   private final evq b;
   private final List<ess.b> c;

   ess(List<evc> $$0, evq $$1, List<ess.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public etg<ess> b() {
      return eth.C;
   }

   @Override
   public Set<euk<?>> a() {
      return this.b.b();
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
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
   public static ess.a a(evq $$0) {
      return new ess.a($$0);
   }

   public static ess.a a(err.b $$0) {
      return new ess.a(evo.a($$0));
   }

   public static class a extends ete.a<ess.a> {
      private final evq a;
      private final List<ess.b> b = Lists.newArrayList();

      a(evq $$0) {
         this.a = $$0;
      }

      public ess.a a(String $$0, String $$1, ess.c $$2) {
         try {
            this.b.add(new ess.b(fl.g.a($$0), fl.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public ess.a a(String $$0, String $$1) {
         return this.a($$0, $$1, ess.c.a);
      }

      protected ess.a a() {
         return this;
      }

      @Override
      public etf b() {
         return new ess(this.g(), this.a, this.b);
      }
   }

   static record b(fl.g b, fl.g c, ess.c d) {
      public static final Codec<ess.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fl.g.a.fieldOf("source").forGetter(ess.b::a), fl.g.a.fieldOf("target").forGetter(ess.b::b), ess.c.d.fieldOf("op").forGetter(ess.b::c))
               .apply($$0, ess.b::new)
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

      public ess.c c() {
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

      public static final Codec<ess.c> d = azk.a(ess.c::values);
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
