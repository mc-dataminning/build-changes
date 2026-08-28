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

public class exi extends exu {
   public static final MapCodec<exi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fah.a.fieldOf("source").forGetter($$0x -> $$0x.b), exi.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, exi::new)
   );
   private final fag b;
   private final List<exi.b> c;

   exi(List<ezs> $$0, fag $$1, List<exi.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public exw<exi> b() {
      return exx.C;
   }

   @Override
   public Set<eza<?>> a() {
      return this.b.b();
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      vu $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<ux> $$3 = new MutableObject();
         Supplier<vu> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(ku.b, czt.a).c());
            }

            return (vu)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         ux $$5 = (ux)$$3.getValue();
         if ($$5 != null) {
            czt.a(ku.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static exi.a a(fag $$0) {
      return new exi.a($$0);
   }

   public static exi.a a(ewh.b $$0) {
      return new exi.a(fae.a($$0));
   }

   public static class a extends exu.a<exi.a> {
      private final fag a;
      private final List<exi.b> b = Lists.newArrayList();

      a(fag $$0) {
         this.a = $$0;
      }

      public exi.a a(String $$0, String $$1, exi.c $$2) {
         try {
            this.b.add(new exi.b(fo.g.a($$0), fo.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public exi.a a(String $$0, String $$1) {
         return this.a($$0, $$1, exi.c.a);
      }

      protected exi.a a() {
         return this;
      }

      @Override
      public exv b() {
         return new exi(this.g(), this.a, this.b);
      }
   }

   static record b(fo.g b, fo.g c, exi.c d) {
      public static final Codec<exi.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fo.g.a.fieldOf("source").forGetter(exi.b::a), fo.g.a.fieldOf("target").forGetter(exi.b::b), exi.c.d.fieldOf("op").forGetter(exi.b::c))
               .apply($$0, exi.b::new)
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

      public exi.c c() {
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

      public static final Codec<exi.c> d = bba.a(exi.c::values);
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
