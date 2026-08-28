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

public class ere extends erp {
   public static final MapCodec<ere> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euc.a.fieldOf("source").forGetter($$0x -> $$0x.b), ere.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, ere::new)
   );
   private final eub b;
   private final List<ere.b> c;

   ere(List<etn> $$0, eub $$1, List<ere.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public err<ere> b() {
      return ers.C;
   }

   @Override
   public Set<esw<?>> a() {
      return this.b.b();
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      vo $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<ur> $$3 = new MutableObject();
         Supplier<vo> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(km.a, cwz.a).c());
            }

            return (vo)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         ur $$5 = (ur)$$3.getValue();
         if ($$5 != null) {
            cwz.a(km.a, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static ere.a a(eub $$0) {
      return new ere.a($$0);
   }

   public static ere.a a(eqd.b $$0) {
      return new ere.a(etz.a($$0));
   }

   public static class a extends erp.a<ere.a> {
      private final eub a;
      private final List<ere.b> b = Lists.newArrayList();

      a(eub $$0) {
         this.a = $$0;
      }

      public ere.a a(String $$0, String $$1, ere.c $$2) {
         try {
            this.b.add(new ere.b(fh.g.a($$0), fh.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public ere.a a(String $$0, String $$1) {
         return this.a($$0, $$1, ere.c.a);
      }

      protected ere.a a() {
         return this;
      }

      @Override
      public erq b() {
         return new ere(this.g(), this.a, this.b);
      }
   }

   static record b(fh.g b, fh.g c, ere.c d) {
      public static final Codec<ere.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fh.g.a.fieldOf("source").forGetter(ere.b::a), fh.g.a.fieldOf("target").forGetter(ere.b::b), ere.c.d.fieldOf("op").forGetter(ere.b::c))
               .apply($$0, ere.b::new)
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

      public ere.c c() {
         return this.d;
      }
   }

   public static enum c implements azp {
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

      public static final Codec<ere.c> d = azp.a(ere.c::values);
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
