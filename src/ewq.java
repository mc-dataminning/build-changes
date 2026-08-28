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

public class ewq extends exc {
   public static final MapCodec<ewq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ezn.a.fieldOf("source").forGetter($$0x -> $$0x.b), ewq.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, ewq::new)
   );
   private final ezm b;
   private final List<ewq.b> c;

   ewq(List<eyy> $$0, ezm $$1, List<ewq.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public exe<ewq> b() {
      return exf.C;
   }

   @Override
   public Set<bah<?>> a() {
      return this.b.b();
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      un $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<tq> $$3 = new MutableObject();
         Supplier<un> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kv.b, cyw.a).d());
            }

            return (un)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         tq $$5 = (tq)$$3.getValue();
         if ($$5 != null) {
            cyw.a(kv.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static ewq.a a(ezm $$0) {
      return new ewq.a($$0);
   }

   public static ewq.a a(evp.b $$0) {
      return new ewq.a(ezk.a($$0));
   }

   public static class a extends exc.a<ewq.a> {
      private final ezm a;
      private final List<ewq.b> b = Lists.newArrayList();

      a(ezm $$0) {
         this.a = $$0;
      }

      public ewq.a a(String $$0, String $$1, ewq.c $$2) {
         try {
            this.b.add(new ewq.b(fp.g.a($$0), fp.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public ewq.a a(String $$0, String $$1) {
         return this.a($$0, $$1, ewq.c.a);
      }

      protected ewq.a a() {
         return this;
      }

      @Override
      public exd b() {
         return new ewq(this.g(), this.a, this.b);
      }
   }

   static record b(fp.g b, fp.g c, ewq.c d) {
      public static final Codec<ewq.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fp.g.a.fieldOf("source").forGetter(ewq.b::a), fp.g.a.fieldOf("target").forGetter(ewq.b::b), ewq.c.d.fieldOf("op").forGetter(ewq.b::c))
               .apply($$0, ewq.b::new)
      );

      public void a(Supplier<un> $$0, un $$1) {
         try {
            List<un> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public fp.g a() {
         return this.b;
      }

      public fp.g b() {
         return this.c;
      }

      public ewq.c c() {
         return this.d;
      }
   }

   public static enum c implements azu {
      a("replace") {
         @Override
         public void a(un $$0, fp.g $$1, List<un> $$2) throws CommandSyntaxException {
            $$1.a($$0, (un)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(un $$0, fp.g $$1, List<un> $$2) throws CommandSyntaxException {
            List<un> $$3 = $$1.a($$0, tw::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof tw) {
                  $$2.forEach($$1xx -> ((tw)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(un $$0, fp.g $$1, List<un> $$2) throws CommandSyntaxException {
            List<un> $$3 = $$1.a($$0, tq::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof tq) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof tq) {
                        ((tq)$$1x).a((tq)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<ewq.c> d = azu.a(ewq.c::values);
      private final String e;

      public abstract void a(un var1, fp.g var2, List<un> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
