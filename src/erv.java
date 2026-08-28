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

public class erv extends esh {
   public static final MapCodec<erv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euu.a.fieldOf("source").forGetter($$0x -> $$0x.b), erv.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, erv::new)
   );
   private final eut b;
   private final List<erv.b> c;

   erv(List<euf> $$0, eut $$1, List<erv.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public esj<erv> b() {
      return esk.C;
   }

   @Override
   public Set<etn<?>> a() {
      return this.b.b();
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      uu $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<tx> $$3 = new MutableObject();
         Supplier<uu> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kn.b, cwq.a).c());
            }

            return (uu)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         tx $$5 = (tx)$$3.getValue();
         if ($$5 != null) {
            cwq.a(kn.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static erv.a a(eut $$0) {
      return new erv.a($$0);
   }

   public static erv.a a(equ.b $$0) {
      return new erv.a(eur.a($$0));
   }

   public static class a extends esh.a<erv.a> {
      private final eut a;
      private final List<erv.b> b = Lists.newArrayList();

      a(eut $$0) {
         this.a = $$0;
      }

      public erv.a a(String $$0, String $$1, erv.c $$2) {
         try {
            this.b.add(new erv.b(fi.g.a($$0), fi.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public erv.a a(String $$0, String $$1) {
         return this.a($$0, $$1, erv.c.a);
      }

      protected erv.a a() {
         return this;
      }

      @Override
      public esi b() {
         return new erv(this.g(), this.a, this.b);
      }
   }

   static record b(fi.g b, fi.g c, erv.c d) {
      public static final Codec<erv.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fi.g.a.fieldOf("source").forGetter(erv.b::a), fi.g.a.fieldOf("target").forGetter(erv.b::b), erv.c.d.fieldOf("op").forGetter(erv.b::c))
               .apply($$0, erv.b::new)
      );

      public void a(Supplier<uu> $$0, uu $$1) {
         try {
            List<uu> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public fi.g a() {
         return this.b;
      }

      public fi.g b() {
         return this.c;
      }

      public erv.c c() {
         return this.d;
      }
   }

   public static enum c implements azc {
      a("replace") {
         @Override
         public void a(uu $$0, fi.g $$1, List<uu> $$2) throws CommandSyntaxException {
            $$1.a($$0, (uu)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(uu $$0, fi.g $$1, List<uu> $$2) throws CommandSyntaxException {
            List<uu> $$3 = $$1.a($$0, ud::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ud) {
                  $$2.forEach($$1xx -> ((ud)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(uu $$0, fi.g $$1, List<uu> $$2) throws CommandSyntaxException {
            List<uu> $$3 = $$1.a($$0, tx::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof tx) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof tx) {
                        ((tx)$$1x).a((tx)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<erv.c> d = azc.a(erv.c::values);
      private final String e;

      public abstract void a(uu var1, fi.g var2, List<uu> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
