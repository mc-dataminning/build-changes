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

public class evo extends ewa {
   public static final MapCodec<evo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eyn.a.fieldOf("source").forGetter($$0x -> $$0x.b), evo.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, evo::new)
   );
   private final eym b;
   private final List<evo.b> c;

   evo(List<exy> $$0, eym $$1, List<evo.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public ewc<evo> b() {
      return ewd.C;
   }

   @Override
   public Set<exg<?>> a() {
      return this.b.b();
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      vi $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<ul> $$3 = new MutableObject();
         Supplier<vi> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(ku.b, cyv.a).c());
            }

            return (vi)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         ul $$5 = (ul)$$3.getValue();
         if ($$5 != null) {
            cyv.a(ku.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static evo.a a(eym $$0) {
      return new evo.a($$0);
   }

   public static evo.a a(eun.b $$0) {
      return new evo.a(eyk.a($$0));
   }

   public static class a extends ewa.a<evo.a> {
      private final eym a;
      private final List<evo.b> b = Lists.newArrayList();

      a(eym $$0) {
         this.a = $$0;
      }

      public evo.a a(String $$0, String $$1, evo.c $$2) {
         try {
            this.b.add(new evo.b(fo.g.a($$0), fo.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public evo.a a(String $$0, String $$1) {
         return this.a($$0, $$1, evo.c.a);
      }

      protected evo.a a() {
         return this;
      }

      @Override
      public ewb b() {
         return new evo(this.g(), this.a, this.b);
      }
   }

   static record b(fo.g b, fo.g c, evo.c d) {
      public static final Codec<evo.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fo.g.a.fieldOf("source").forGetter(evo.b::a), fo.g.a.fieldOf("target").forGetter(evo.b::b), evo.c.d.fieldOf("op").forGetter(evo.b::c))
               .apply($$0, evo.b::new)
      );

      public void a(Supplier<vi> $$0, vi $$1) {
         try {
            List<vi> $$2 = this.b.a($$1);
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

      public evo.c c() {
         return this.d;
      }
   }

   public static enum c implements bai {
      a("replace") {
         @Override
         public void a(vi $$0, fo.g $$1, List<vi> $$2) throws CommandSyntaxException {
            $$1.a($$0, (vi)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(vi $$0, fo.g $$1, List<vi> $$2) throws CommandSyntaxException {
            List<vi> $$3 = $$1.a($$0, ur::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ur) {
                  $$2.forEach($$1xx -> ((ur)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(vi $$0, fo.g $$1, List<vi> $$2) throws CommandSyntaxException {
            List<vi> $$3 = $$1.a($$0, ul::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ul) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof ul) {
                        ((ul)$$1x).a((ul)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<evo.c> d = bai.a(evo.c::values);
      private final String e;

      public abstract void a(vi var1, fo.g var2, List<vi> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
