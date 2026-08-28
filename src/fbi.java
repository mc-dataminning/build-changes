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

public class fbi extends fbu {
   public static final MapCodec<fbi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fef.a.fieldOf("source").forGetter($$0x -> $$0x.b), fbi.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, fbi::new)
   );
   private final fee b;
   private final List<fbi.b> c;

   fbi(List<fdq> $$0, fee $$1, List<fbi.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public fbw<fbi> b() {
      return fbx.C;
   }

   @Override
   public Set<baz<?>> a() {
      return this.b.b();
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      uy $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<tz> $$3 = new MutableObject();
         Supplier<uy> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kk.b, dcg.a).d());
            }

            return (uy)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         tz $$5 = (tz)$$3.getValue();
         if ($$5 != null) {
            dcg.a(kk.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static fbi.a a(fee $$0) {
      return new fbi.a($$0);
   }

   public static fbi.a a(fah.b $$0) {
      return new fbi.a(fec.a($$0));
   }

   public static class a extends fbu.a<fbi.a> {
      private final fee a;
      private final List<fbi.b> b = Lists.newArrayList();

      a(fee $$0) {
         this.a = $$0;
      }

      public fbi.a a(String $$0, String $$1, fbi.c $$2) {
         try {
            this.b.add(new fbi.b(fb.g.a($$0), fb.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public fbi.a a(String $$0, String $$1) {
         return this.a($$0, $$1, fbi.c.a);
      }

      protected fbi.a a() {
         return this;
      }

      @Override
      public fbv b() {
         return new fbi(this.g(), this.a, this.b);
      }
   }

   static record b(fb.g b, fb.g c, fbi.c d) {
      public static final Codec<fbi.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fb.g.a.fieldOf("source").forGetter(fbi.b::a), fb.g.a.fieldOf("target").forGetter(fbi.b::b), fbi.c.d.fieldOf("op").forGetter(fbi.b::c))
               .apply($$0, fbi.b::new)
      );

      public void a(Supplier<uy> $$0, uy $$1) {
         try {
            List<uy> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public fb.g a() {
         return this.b;
      }

      public fb.g b() {
         return this.c;
      }

      public fbi.c c() {
         return this.d;
      }
   }

   public static enum c implements bam {
      a("replace") {
         @Override
         public void a(uy $$0, fb.g $$1, List<uy> $$2) throws CommandSyntaxException {
            $$1.a($$0, (uy)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(uy $$0, fb.g $$1, List<uy> $$2) throws CommandSyntaxException {
            List<uy> $$3 = $$1.a($$0, uf::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof uf) {
                  $$2.forEach($$1xx -> ((uf)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(uy $$0, fb.g $$1, List<uy> $$2) throws CommandSyntaxException {
            List<uy> $$3 = $$1.a($$0, tz::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof tz) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof tz) {
                        ((tz)$$1x).a((tz)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<fbi.c> d = bam.a(fbi.c::values);
      private final String e;

      public abstract void a(uy var1, fb.g var2, List<uy> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
