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

public class fbk extends fbw {
   public static final MapCodec<fbk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(feh.a.fieldOf("source").forGetter($$0x -> $$0x.b), fbk.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, fbk::new)
   );
   private final feg b;
   private final List<fbk.b> c;

   fbk(List<fds> $$0, feg $$1, List<fbk.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public fby<fbk> b() {
      return fbz.C;
   }

   @Override
   public Set<bbb<?>> a() {
      return this.b.b();
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      va $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<ua> $$3 = new MutableObject();
         Supplier<va> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kl.b, dci.a).d());
            }

            return (va)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         ua $$5 = (ua)$$3.getValue();
         if ($$5 != null) {
            dci.a(kl.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static fbk.a a(feg $$0) {
      return new fbk.a($$0);
   }

   public static fbk.a a(faj.b $$0) {
      return new fbk.a(fee.a($$0));
   }

   public static class a extends fbw.a<fbk.a> {
      private final feg a;
      private final List<fbk.b> b = Lists.newArrayList();

      a(feg $$0) {
         this.a = $$0;
      }

      public fbk.a a(String $$0, String $$1, fbk.c $$2) {
         try {
            this.b.add(new fbk.b(fc.g.a($$0), fc.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public fbk.a a(String $$0, String $$1) {
         return this.a($$0, $$1, fbk.c.a);
      }

      protected fbk.a a() {
         return this;
      }

      @Override
      public fbx b() {
         return new fbk(this.g(), this.a, this.b);
      }
   }

   static record b(fc.g b, fc.g c, fbk.c d) {
      public static final Codec<fbk.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fc.g.a.fieldOf("source").forGetter(fbk.b::a), fc.g.a.fieldOf("target").forGetter(fbk.b::b), fbk.c.d.fieldOf("op").forGetter(fbk.b::c))
               .apply($$0, fbk.b::new)
      );

      public void a(Supplier<va> $$0, va $$1) {
         try {
            List<va> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public fc.g a() {
         return this.b;
      }

      public fc.g b() {
         return this.c;
      }

      public fbk.c c() {
         return this.d;
      }
   }

   public static enum c implements bao {
      a("replace") {
         @Override
         public void a(va $$0, fc.g $$1, List<va> $$2) throws CommandSyntaxException {
            $$1.a($$0, (va)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(va $$0, fc.g $$1, List<va> $$2) throws CommandSyntaxException {
            List<va> $$3 = $$1.a($$0, ug::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ug) {
                  $$2.forEach($$1xx -> ((ug)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(va $$0, fc.g $$1, List<va> $$2) throws CommandSyntaxException {
            List<va> $$3 = $$1.a($$0, ua::new);
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

      public static final Codec<fbk.c> d = bao.a(fbk.c::values);
      private final String e;

      public abstract void a(va var1, fc.g var2, List<va> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
