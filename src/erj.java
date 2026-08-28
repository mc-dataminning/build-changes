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

public class erj extends eru {
   public static final MapCodec<erj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euh.a.fieldOf("source").forGetter($$0x -> $$0x.b), erj.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, erj::new)
   );
   private final eug b;
   private final List<erj.b> c;

   erj(List<ets> $$0, eug $$1, List<erj.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public erw<erj> b() {
      return erx.C;
   }

   @Override
   public Set<etb<?>> a() {
      return this.b.b();
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      vp $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<us> $$3 = new MutableObject();
         Supplier<vp> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(km.b, cxe.a).c());
            }

            return (vp)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         us $$5 = (us)$$3.getValue();
         if ($$5 != null) {
            cxe.a(km.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static erj.a a(eug $$0) {
      return new erj.a($$0);
   }

   public static erj.a a(eqi.b $$0) {
      return new erj.a(eue.a($$0));
   }

   public static class a extends eru.a<erj.a> {
      private final eug a;
      private final List<erj.b> b = Lists.newArrayList();

      a(eug $$0) {
         this.a = $$0;
      }

      public erj.a a(String $$0, String $$1, erj.c $$2) {
         try {
            this.b.add(new erj.b(fh.g.a($$0), fh.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public erj.a a(String $$0, String $$1) {
         return this.a($$0, $$1, erj.c.a);
      }

      protected erj.a a() {
         return this;
      }

      @Override
      public erv b() {
         return new erj(this.g(), this.a, this.b);
      }
   }

   static record b(fh.g b, fh.g c, erj.c d) {
      public static final Codec<erj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fh.g.a.fieldOf("source").forGetter(erj.b::a), fh.g.a.fieldOf("target").forGetter(erj.b::b), erj.c.d.fieldOf("op").forGetter(erj.b::c))
               .apply($$0, erj.b::new)
      );

      public void a(Supplier<vp> $$0, vp $$1) {
         try {
            List<vp> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public fh.g a() {
         return this.b;
      }

      public fh.g b() {
         return this.c;
      }

      public erj.c c() {
         return this.d;
      }
   }

   public static enum c implements azu {
      a("replace") {
         @Override
         public void a(vp $$0, fh.g $$1, List<vp> $$2) throws CommandSyntaxException {
            $$1.a($$0, (vp)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(vp $$0, fh.g $$1, List<vp> $$2) throws CommandSyntaxException {
            List<vp> $$3 = $$1.a($$0, uy::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof uy) {
                  $$2.forEach($$1xx -> ((uy)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(vp $$0, fh.g $$1, List<vp> $$2) throws CommandSyntaxException {
            List<vp> $$3 = $$1.a($$0, us::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof us) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof us) {
                        ((us)$$1x).a((us)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<erj.c> d = azu.a(erj.c::values);
      private final String e;

      public abstract void a(vp var1, fh.g var2, List<vp> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
