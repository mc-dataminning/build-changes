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

public class evh extends evt {
   public static final MapCodec<evh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eyg.a.fieldOf("source").forGetter($$0x -> $$0x.b), evh.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, evh::new)
   );
   private final eyf b;
   private final List<evh.b> c;

   evh(List<exr> $$0, eyf $$1, List<evh.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public evv<evh> b() {
      return evw.C;
   }

   @Override
   public Set<ewz<?>> a() {
      return this.b.b();
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      vk $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<un> $$3 = new MutableObject();
         Supplier<vk> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(ku.b, cyo.a).c());
            }

            return (vk)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         un $$5 = (un)$$3.getValue();
         if ($$5 != null) {
            cyo.a(ku.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static evh.a a(eyf $$0) {
      return new evh.a($$0);
   }

   public static evh.a a(eug.b $$0) {
      return new evh.a(eyd.a($$0));
   }

   public static class a extends evt.a<evh.a> {
      private final eyf a;
      private final List<evh.b> b = Lists.newArrayList();

      a(eyf $$0) {
         this.a = $$0;
      }

      public evh.a a(String $$0, String $$1, evh.c $$2) {
         try {
            this.b.add(new evh.b(fo.g.a($$0), fo.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public evh.a a(String $$0, String $$1) {
         return this.a($$0, $$1, evh.c.a);
      }

      protected evh.a a() {
         return this;
      }

      @Override
      public evu b() {
         return new evh(this.g(), this.a, this.b);
      }
   }

   static record b(fo.g b, fo.g c, evh.c d) {
      public static final Codec<evh.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fo.g.a.fieldOf("source").forGetter(evh.b::a), fo.g.a.fieldOf("target").forGetter(evh.b::b), evh.c.d.fieldOf("op").forGetter(evh.b::c))
               .apply($$0, evh.b::new)
      );

      public void a(Supplier<vk> $$0, vk $$1) {
         try {
            List<vk> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public fo.g a() {
         return this.b;
      }

      public fo.g b() {
         return this.c;
      }

      public evh.c c() {
         return this.d;
      }
   }

   public static enum c implements baj {
      a("replace") {
         @Override
         public void a(vk $$0, fo.g $$1, List<vk> $$2) throws CommandSyntaxException {
            $$1.a($$0, (vk)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(vk $$0, fo.g $$1, List<vk> $$2) throws CommandSyntaxException {
            List<vk> $$3 = $$1.a($$0, ut::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ut) {
                  $$2.forEach($$1xx -> ((ut)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(vk $$0, fo.g $$1, List<vk> $$2) throws CommandSyntaxException {
            List<vk> $$3 = $$1.a($$0, un::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof un) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof un) {
                        ((un)$$1x).a((un)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<evh.c> d = baj.a(evh.c::values);
      private final String e;

      public abstract void a(vk var1, fo.g var2, List<vk> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
