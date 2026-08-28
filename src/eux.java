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

public class eux extends evj {
   public static final MapCodec<eux> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(exw.a.fieldOf("source").forGetter($$0x -> $$0x.b), eux.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, eux::new)
   );
   private final exv b;
   private final List<eux.b> c;

   eux(List<exh> $$0, exv $$1, List<eux.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public evl<eux> b() {
      return evm.C;
   }

   @Override
   public Set<ewp<?>> a() {
      return this.b.b();
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      vg $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<uj> $$3 = new MutableObject();
         Supplier<vg> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kt.b, cyg.a).c());
            }

            return (vg)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         uj $$5 = (uj)$$3.getValue();
         if ($$5 != null) {
            cyg.a(kt.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static eux.a a(exv $$0) {
      return new eux.a($$0);
   }

   public static eux.a a(etw.b $$0) {
      return new eux.a(ext.a($$0));
   }

   public static class a extends evj.a<eux.a> {
      private final exv a;
      private final List<eux.b> b = Lists.newArrayList();

      a(exv $$0) {
         this.a = $$0;
      }

      public eux.a a(String $$0, String $$1, eux.c $$2) {
         try {
            this.b.add(new eux.b(fn.g.a($$0), fn.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public eux.a a(String $$0, String $$1) {
         return this.a($$0, $$1, eux.c.a);
      }

      protected eux.a a() {
         return this;
      }

      @Override
      public evk b() {
         return new eux(this.g(), this.a, this.b);
      }
   }

   static record b(fn.g b, fn.g c, eux.c d) {
      public static final Codec<eux.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fn.g.a.fieldOf("source").forGetter(eux.b::a), fn.g.a.fieldOf("target").forGetter(eux.b::b), eux.c.d.fieldOf("op").forGetter(eux.b::c))
               .apply($$0, eux.b::new)
      );

      public void a(Supplier<vg> $$0, vg $$1) {
         try {
            List<vg> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public fn.g a() {
         return this.b;
      }

      public fn.g b() {
         return this.c;
      }

      public eux.c c() {
         return this.d;
      }
   }

   public static enum c implements baf {
      a("replace") {
         @Override
         public void a(vg $$0, fn.g $$1, List<vg> $$2) throws CommandSyntaxException {
            $$1.a($$0, (vg)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(vg $$0, fn.g $$1, List<vg> $$2) throws CommandSyntaxException {
            List<vg> $$3 = $$1.a($$0, up::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof up) {
                  $$2.forEach($$1xx -> ((up)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(vg $$0, fn.g $$1, List<vg> $$2) throws CommandSyntaxException {
            List<vg> $$3 = $$1.a($$0, uj::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof uj) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof uj) {
                        ((uj)$$1x).a((uj)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<eux.c> d = baf.a(eux.c::values);
      private final String e;

      public abstract void a(vg var1, fn.g var2, List<vg> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
