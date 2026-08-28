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

public class etu extends eug {
   public static final MapCodec<etu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ewt.a.fieldOf("source").forGetter($$0x -> $$0x.b), etu.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, etu::new)
   );
   private final ews b;
   private final List<etu.b> c;

   etu(List<ewe> $$0, ews $$1, List<etu.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eui<etu> b() {
      return euj.C;
   }

   @Override
   public Set<evm<?>> a() {
      return this.b.b();
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      vc $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<uf> $$3 = new MutableObject();
         Supplier<vc> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kr.b, cya.a).c());
            }

            return (vc)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         uf $$5 = (uf)$$3.getValue();
         if ($$5 != null) {
            cya.a(kr.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static etu.a a(ews $$0) {
      return new etu.a($$0);
   }

   public static etu.a a(est.b $$0) {
      return new etu.a(ewq.a($$0));
   }

   public static class a extends eug.a<etu.a> {
      private final ews a;
      private final List<etu.b> b = Lists.newArrayList();

      a(ews $$0) {
         this.a = $$0;
      }

      public etu.a a(String $$0, String $$1, etu.c $$2) {
         try {
            this.b.add(new etu.b(fl.g.a($$0), fl.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public etu.a a(String $$0, String $$1) {
         return this.a($$0, $$1, etu.c.a);
      }

      protected etu.a a() {
         return this;
      }

      @Override
      public euh b() {
         return new etu(this.g(), this.a, this.b);
      }
   }

   static record b(fl.g b, fl.g c, etu.c d) {
      public static final Codec<etu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fl.g.a.fieldOf("source").forGetter(etu.b::a), fl.g.a.fieldOf("target").forGetter(etu.b::b), etu.c.d.fieldOf("op").forGetter(etu.b::c))
               .apply($$0, etu.b::new)
      );

      public void a(Supplier<vc> $$0, vc $$1) {
         try {
            List<vc> $$2 = this.b.a($$1);
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

      public etu.c c() {
         return this.d;
      }
   }

   public static enum c implements azy {
      a("replace") {
         @Override
         public void a(vc $$0, fl.g $$1, List<vc> $$2) throws CommandSyntaxException {
            $$1.a($$0, (vc)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(vc $$0, fl.g $$1, List<vc> $$2) throws CommandSyntaxException {
            List<vc> $$3 = $$1.a($$0, ul::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ul) {
                  $$2.forEach($$1xx -> ((ul)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(vc $$0, fl.g $$1, List<vc> $$2) throws CommandSyntaxException {
            List<vc> $$3 = $$1.a($$0, uf::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof uf) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof uf) {
                        ((uf)$$1x).a((uf)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<etu.c> d = azy.a(etu.c::values);
      private final String e;

      public abstract void a(vc var1, fl.g var2, List<vc> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
