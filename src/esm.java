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

public class esm extends esy {
   public static final MapCodec<esm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evl.a.fieldOf("source").forGetter($$0x -> $$0x.b), esm.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, esm::new)
   );
   private final evk b;
   private final List<esm.b> c;

   esm(List<euw> $$0, evk $$1, List<esm.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eta<esm> b() {
      return etb.C;
   }

   @Override
   public Set<eue<?>> a() {
      return this.b.b();
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      ux $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<ua> $$3 = new MutableObject();
         Supplier<ux> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kq.b, cxf.a).c());
            }

            return (ux)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         ua $$5 = (ua)$$3.getValue();
         if ($$5 != null) {
            cxf.a(kq.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static esm.a a(evk $$0) {
      return new esm.a($$0);
   }

   public static esm.a a(erl.b $$0) {
      return new esm.a(evi.a($$0));
   }

   public static class a extends esy.a<esm.a> {
      private final evk a;
      private final List<esm.b> b = Lists.newArrayList();

      a(evk $$0) {
         this.a = $$0;
      }

      public esm.a a(String $$0, String $$1, esm.c $$2) {
         try {
            this.b.add(new esm.b(fl.g.a($$0), fl.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public esm.a a(String $$0, String $$1) {
         return this.a($$0, $$1, esm.c.a);
      }

      protected esm.a a() {
         return this;
      }

      @Override
      public esz b() {
         return new esm(this.g(), this.a, this.b);
      }
   }

   static record b(fl.g b, fl.g c, esm.c d) {
      public static final Codec<esm.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fl.g.a.fieldOf("source").forGetter(esm.b::a), fl.g.a.fieldOf("target").forGetter(esm.b::b), esm.c.d.fieldOf("op").forGetter(esm.b::c))
               .apply($$0, esm.b::new)
      );

      public void a(Supplier<ux> $$0, ux $$1) {
         try {
            List<ux> $$2 = this.b.a($$1);
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

      public esm.c c() {
         return this.d;
      }
   }

   public static enum c implements azj {
      a("replace") {
         @Override
         public void a(ux $$0, fl.g $$1, List<ux> $$2) throws CommandSyntaxException {
            $$1.a($$0, (ux)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(ux $$0, fl.g $$1, List<ux> $$2) throws CommandSyntaxException {
            List<ux> $$3 = $$1.a($$0, ug::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ug) {
                  $$2.forEach($$1xx -> ((ug)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(ux $$0, fl.g $$1, List<ux> $$2) throws CommandSyntaxException {
            List<ux> $$3 = $$1.a($$0, ua::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ua) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof ua) {
                        ((ua)$$1x).a((ua)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<esm.c> d = azj.a(esm.c::values);
      private final String e;

      public abstract void a(ux var1, fl.g var2, List<ux> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
