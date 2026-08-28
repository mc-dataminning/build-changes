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

public class erh extends ers {
   public static final MapCodec<erh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euf.a.fieldOf("source").forGetter($$0x -> $$0x.b), erh.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, erh::new)
   );
   private final eue b;
   private final List<erh.b> c;

   erh(List<etq> $$0, eue $$1, List<erh.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eru<erh> b() {
      return erv.C;
   }

   @Override
   public Set<esz<?>> a() {
      return this.b.b();
   }

   @Override
   public cun a(cun $$0, eqg $$1) {
      vo $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<ur> $$3 = new MutableObject();
         Supplier<vo> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(km.a, cxc.a).c());
            }

            return (vo)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         ur $$5 = (ur)$$3.getValue();
         if ($$5 != null) {
            cxc.a(km.a, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static erh.a a(eue $$0) {
      return new erh.a($$0);
   }

   public static erh.a a(eqg.b $$0) {
      return new erh.a(euc.a($$0));
   }

   public static class a extends ers.a<erh.a> {
      private final eue a;
      private final List<erh.b> b = Lists.newArrayList();

      a(eue $$0) {
         this.a = $$0;
      }

      public erh.a a(String $$0, String $$1, erh.c $$2) {
         try {
            this.b.add(new erh.b(fh.g.a($$0), fh.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public erh.a a(String $$0, String $$1) {
         return this.a($$0, $$1, erh.c.a);
      }

      protected erh.a a() {
         return this;
      }

      @Override
      public ert b() {
         return new erh(this.g(), this.a, this.b);
      }
   }

   static record b(fh.g b, fh.g c, erh.c d) {
      public static final Codec<erh.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fh.g.a.fieldOf("source").forGetter(erh.b::a), fh.g.a.fieldOf("target").forGetter(erh.b::b), erh.c.d.fieldOf("op").forGetter(erh.b::c))
               .apply($$0, erh.b::new)
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

      public erh.c c() {
         return this.d;
      }
   }

   public static enum c implements azs {
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

      public static final Codec<erh.c> d = azs.a(erh.c::values);
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
