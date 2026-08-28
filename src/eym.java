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

public class eym extends eyy {
   public static final MapCodec<eym> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fbj.a.fieldOf("source").forGetter($$0x -> $$0x.b), eym.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, eym::new)
   );
   private final fbi b;
   private final List<eym.b> c;

   eym(List<fau> $$0, fbi $$1, List<eym.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eza<eym> b() {
      return ezb.C;
   }

   @Override
   public Set<bat<?>> a() {
      return this.b.b();
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      ut $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<tw> $$3 = new MutableObject();
         Supplier<ut> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kx.b, dae.a).d());
            }

            return (ut)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         tw $$5 = (tw)$$3.getValue();
         if ($$5 != null) {
            dae.a(kx.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static eym.a a(fbi $$0) {
      return new eym.a($$0);
   }

   public static eym.a a(exl.b $$0) {
      return new eym.a(fbg.a($$0));
   }

   public static class a extends eyy.a<eym.a> {
      private final fbi a;
      private final List<eym.b> b = Lists.newArrayList();

      a(fbi $$0) {
         this.a = $$0;
      }

      public eym.a a(String $$0, String $$1, eym.c $$2) {
         try {
            this.b.add(new eym.b(fp.g.a($$0), fp.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public eym.a a(String $$0, String $$1) {
         return this.a($$0, $$1, eym.c.a);
      }

      protected eym.a a() {
         return this;
      }

      @Override
      public eyz b() {
         return new eym(this.g(), this.a, this.b);
      }
   }

   static record b(fp.g b, fp.g c, eym.c d) {
      public static final Codec<eym.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fp.g.a.fieldOf("source").forGetter(eym.b::a), fp.g.a.fieldOf("target").forGetter(eym.b::b), eym.c.d.fieldOf("op").forGetter(eym.b::c))
               .apply($$0, eym.b::new)
      );

      public void a(Supplier<ut> $$0, ut $$1) {
         try {
            List<ut> $$2 = this.b.a($$1);
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

      public eym.c c() {
         return this.d;
      }
   }

   public static enum c implements bag {
      a("replace") {
         @Override
         public void a(ut $$0, fp.g $$1, List<ut> $$2) throws CommandSyntaxException {
            $$1.a($$0, (ut)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(ut $$0, fp.g $$1, List<ut> $$2) throws CommandSyntaxException {
            List<ut> $$3 = $$1.a($$0, uc::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof uc) {
                  $$2.forEach($$1xx -> ((uc)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(ut $$0, fp.g $$1, List<ut> $$2) throws CommandSyntaxException {
            List<ut> $$3 = $$1.a($$0, tw::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof tw) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof tw) {
                        ((tw)$$1x).a((tw)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<eym.c> d = bag.a(eym.c::values);
      private final String e;

      public abstract void a(ut var1, fp.g var2, List<ut> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
