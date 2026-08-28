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

public class ezo extends faa {
   public static final MapCodec<ezo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fcl.a.fieldOf("source").forGetter($$0x -> $$0x.b), ezo.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, ezo::new)
   );
   private final fck b;
   private final List<ezo.b> c;

   ezo(List<fbw> $$0, fck $$1, List<ezo.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public fac<ezo> b() {
      return fad.C;
   }

   @Override
   public Set<bav<?>> a() {
      return this.b.b();
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      uu $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<tx> $$3 = new MutableObject();
         Supplier<uu> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kj.b, dba.a).d());
            }

            return (uu)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         tx $$5 = (tx)$$3.getValue();
         if ($$5 != null) {
            dba.a(kj.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static ezo.a a(fck $$0) {
      return new ezo.a($$0);
   }

   public static ezo.a a(eyn.b $$0) {
      return new ezo.a(fci.a($$0));
   }

   public static class a extends faa.a<ezo.a> {
      private final fck a;
      private final List<ezo.b> b = Lists.newArrayList();

      a(fck $$0) {
         this.a = $$0;
      }

      public ezo.a a(String $$0, String $$1, ezo.c $$2) {
         try {
            this.b.add(new ezo.b(fa.g.a($$0), fa.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public ezo.a a(String $$0, String $$1) {
         return this.a($$0, $$1, ezo.c.a);
      }

      protected ezo.a a() {
         return this;
      }

      @Override
      public fab b() {
         return new ezo(this.g(), this.a, this.b);
      }
   }

   static record b(fa.g b, fa.g c, ezo.c d) {
      public static final Codec<ezo.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fa.g.a.fieldOf("source").forGetter(ezo.b::a), fa.g.a.fieldOf("target").forGetter(ezo.b::b), ezo.c.d.fieldOf("op").forGetter(ezo.b::c))
               .apply($$0, ezo.b::new)
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

      public fa.g a() {
         return this.b;
      }

      public fa.g b() {
         return this.c;
      }

      public ezo.c c() {
         return this.d;
      }
   }

   public static enum c implements bai {
      a("replace") {
         @Override
         public void a(uu $$0, fa.g $$1, List<uu> $$2) throws CommandSyntaxException {
            $$1.a($$0, (uu)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(uu $$0, fa.g $$1, List<uu> $$2) throws CommandSyntaxException {
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
         public void a(uu $$0, fa.g $$1, List<uu> $$2) throws CommandSyntaxException {
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

      public static final Codec<ezo.c> d = bai.a(ezo.c::values);
      private final String e;

      public abstract void a(uu var1, fa.g var2, List<uu> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
