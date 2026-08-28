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

public class exp extends eyb {
   public static final MapCodec<exp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fam.a.fieldOf("source").forGetter($$0x -> $$0x.b), exp.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, exp::new)
   );
   private final fal b;
   private final List<exp.b> c;

   exp(List<ezx> $$0, fal $$1, List<exp.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eyd<exp> b() {
      return eye.C;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.b();
   }

   @Override
   public cxh a(cxh $$0, ewo $$1) {
      un $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<tq> $$3 = new MutableObject();
         Supplier<un> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kv.b, czo.a).d());
            }

            return (un)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         tq $$5 = (tq)$$3.getValue();
         if ($$5 != null) {
            czo.a(kv.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static exp.a a(fal $$0) {
      return new exp.a($$0);
   }

   public static exp.a a(ewo.b $$0) {
      return new exp.a(faj.a($$0));
   }

   public static class a extends eyb.a<exp.a> {
      private final fal a;
      private final List<exp.b> b = Lists.newArrayList();

      a(fal $$0) {
         this.a = $$0;
      }

      public exp.a a(String $$0, String $$1, exp.c $$2) {
         try {
            this.b.add(new exp.b(fp.g.a($$0), fp.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public exp.a a(String $$0, String $$1) {
         return this.a($$0, $$1, exp.c.a);
      }

      protected exp.a a() {
         return this;
      }

      @Override
      public eyc b() {
         return new exp(this.g(), this.a, this.b);
      }
   }

   static record b(fp.g b, fp.g c, exp.c d) {
      public static final Codec<exp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fp.g.a.fieldOf("source").forGetter(exp.b::a), fp.g.a.fieldOf("target").forGetter(exp.b::b), exp.c.d.fieldOf("op").forGetter(exp.b::c))
               .apply($$0, exp.b::new)
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

      public exp.c c() {
         return this.d;
      }
   }

   public static enum c implements azv {
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

      public static final Codec<exp.c> d = azv.a(exp.c::values);
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
