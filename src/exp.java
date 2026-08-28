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
   public Set<bbn<?>> a() {
      return this.b.b();
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      vu $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<ux> $$3 = new MutableObject();
         Supplier<vu> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(ku.b, czx.a).c());
            }

            return (vu)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         ux $$5 = (ux)$$3.getValue();
         if ($$5 != null) {
            czx.a(ku.b, $$0, $$5);
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
            this.b.add(new exp.b(fo.g.a($$0), fo.g.a($$1), $$2));
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

   static record b(fo.g b, fo.g c, exp.c d) {
      public static final Codec<exp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fo.g.a.fieldOf("source").forGetter(exp.b::a), fo.g.a.fieldOf("target").forGetter(exp.b::b), exp.c.d.fieldOf("op").forGetter(exp.b::c))
               .apply($$0, exp.b::new)
      );

      public void a(Supplier<vu> $$0, vu $$1) {
         try {
            List<vu> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public fo.g a() {
         return this.b;
      }

      public fo.g b() {
         return this.c;
      }

      public exp.c c() {
         return this.d;
      }
   }

   public static enum c implements bba {
      a("replace") {
         @Override
         public void a(vu $$0, fo.g $$1, List<vu> $$2) throws CommandSyntaxException {
            $$1.a($$0, (vu)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(vu $$0, fo.g $$1, List<vu> $$2) throws CommandSyntaxException {
            List<vu> $$3 = $$1.a($$0, vd::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof vd) {
                  $$2.forEach($$1xx -> ((vd)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(vu $$0, fo.g $$1, List<vu> $$2) throws CommandSyntaxException {
            List<vu> $$3 = $$1.a($$0, ux::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ux) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof ux) {
                        ((ux)$$1x).a((ux)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<exp.c> d = bba.a(exp.c::values);
      private final String e;

      public abstract void a(vu var1, fo.g var2, List<vu> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
