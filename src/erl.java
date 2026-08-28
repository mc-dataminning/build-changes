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

public class erl extends erw {
   public static final MapCodec<erl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euj.a.fieldOf("source").forGetter($$0x -> $$0x.b), erl.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, erl::new)
   );
   private final eui b;
   private final List<erl.b> c;

   erl(List<etu> $$0, eui $$1, List<erl.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public ery<erl> b() {
      return erz.C;
   }

   @Override
   public Set<etd<?>> a() {
      return this.b.b();
   }

   @Override
   public cur a(cur $$0, eqk $$1) {
      vp $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<us> $$3 = new MutableObject();
         Supplier<vp> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(km.b, cxg.a).c());
            }

            return (vp)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         us $$5 = (us)$$3.getValue();
         if ($$5 != null) {
            cxg.a(km.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static erl.a a(eui $$0) {
      return new erl.a($$0);
   }

   public static erl.a a(eqk.b $$0) {
      return new erl.a(eug.a($$0));
   }

   public static class a extends erw.a<erl.a> {
      private final eui a;
      private final List<erl.b> b = Lists.newArrayList();

      a(eui $$0) {
         this.a = $$0;
      }

      public erl.a a(String $$0, String $$1, erl.c $$2) {
         try {
            this.b.add(new erl.b(fh.g.a($$0), fh.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public erl.a a(String $$0, String $$1) {
         return this.a($$0, $$1, erl.c.a);
      }

      protected erl.a a() {
         return this;
      }

      @Override
      public erx b() {
         return new erl(this.g(), this.a, this.b);
      }
   }

   static record b(fh.g b, fh.g c, erl.c d) {
      public static final Codec<erl.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fh.g.a.fieldOf("source").forGetter(erl.b::a), fh.g.a.fieldOf("target").forGetter(erl.b::b), erl.c.d.fieldOf("op").forGetter(erl.b::c))
               .apply($$0, erl.b::new)
      );

      public void a(Supplier<vp> $$0, vp $$1) {
         try {
            List<vp> $$2 = this.b.a($$1);
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

      public erl.c c() {
         return this.d;
      }
   }

   public static enum c implements azu {
      a("replace") {
         @Override
         public void a(vp $$0, fh.g $$1, List<vp> $$2) throws CommandSyntaxException {
            $$1.a($$0, (vp)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(vp $$0, fh.g $$1, List<vp> $$2) throws CommandSyntaxException {
            List<vp> $$3 = $$1.a($$0, uy::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof uy) {
                  $$2.forEach($$1xx -> ((uy)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(vp $$0, fh.g $$1, List<vp> $$2) throws CommandSyntaxException {
            List<vp> $$3 = $$1.a($$0, us::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof us) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof us) {
                        ((us)$$1x).a((us)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<erl.c> d = azu.a(erl.c::values);
      private final String e;

      public abstract void a(vp var1, fh.g var2, List<vp> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
