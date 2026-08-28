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

public class eri extends ert {
   public static final MapCodec<eri> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eug.a.fieldOf("source").forGetter($$0x -> $$0x.b), eri.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, eri::new)
   );
   private final euf b;
   private final List<eri.b> c;

   eri(List<etr> $$0, euf $$1, List<eri.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public erv<eri> b() {
      return erw.C;
   }

   @Override
   public Set<eta<?>> a() {
      return this.b.b();
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      vo $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<ur> $$3 = new MutableObject();
         Supplier<vo> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(km.b, cxd.a).c());
            }

            return (vo)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         ur $$5 = (ur)$$3.getValue();
         if ($$5 != null) {
            cxd.a(km.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static eri.a a(euf $$0) {
      return new eri.a($$0);
   }

   public static eri.a a(eqh.b $$0) {
      return new eri.a(eud.a($$0));
   }

   public static class a extends ert.a<eri.a> {
      private final euf a;
      private final List<eri.b> b = Lists.newArrayList();

      a(euf $$0) {
         this.a = $$0;
      }

      public eri.a a(String $$0, String $$1, eri.c $$2) {
         try {
            this.b.add(new eri.b(fh.g.a($$0), fh.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public eri.a a(String $$0, String $$1) {
         return this.a($$0, $$1, eri.c.a);
      }

      protected eri.a a() {
         return this;
      }

      @Override
      public eru b() {
         return new eri(this.g(), this.a, this.b);
      }
   }

   static record b(fh.g b, fh.g c, eri.c d) {
      public static final Codec<eri.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fh.g.a.fieldOf("source").forGetter(eri.b::a), fh.g.a.fieldOf("target").forGetter(eri.b::b), eri.c.d.fieldOf("op").forGetter(eri.b::c))
               .apply($$0, eri.b::new)
      );

      public void a(Supplier<vo> $$0, vo $$1) {
         try {
            List<vo> $$2 = this.b.a($$1);
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

      public eri.c c() {
         return this.d;
      }
   }

   public static enum c implements azt {
      a("replace") {
         @Override
         public void a(vo $$0, fh.g $$1, List<vo> $$2) throws CommandSyntaxException {
            $$1.a($$0, (vo)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(vo $$0, fh.g $$1, List<vo> $$2) throws CommandSyntaxException {
            List<vo> $$3 = $$1.a($$0, ux::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ux) {
                  $$2.forEach($$1xx -> ((ux)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(vo $$0, fh.g $$1, List<vo> $$2) throws CommandSyntaxException {
            List<vo> $$3 = $$1.a($$0, ur::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ur) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof ur) {
                        ((ur)$$1x).a((ur)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<eri.c> d = azt.a(eri.c::values);
      private final String e;

      public abstract void a(vo var1, fh.g var2, List<vo> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
