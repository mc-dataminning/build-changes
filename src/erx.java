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

public class erx extends esj {
   public static final MapCodec<erx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euw.a.fieldOf("source").forGetter($$0x -> $$0x.b), erx.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, erx::new)
   );
   private final euv b;
   private final List<erx.b> c;

   erx(List<euh> $$0, euv $$1, List<erx.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public esl<erx> b() {
      return esm.C;
   }

   @Override
   public Set<etp<?>> a() {
      return this.b.b();
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      uu $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<tx> $$3 = new MutableObject();
         Supplier<uu> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kn.b, cwr.a).c());
            }

            return (uu)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         tx $$5 = (tx)$$3.getValue();
         if ($$5 != null) {
            cwr.a(kn.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static erx.a a(euv $$0) {
      return new erx.a($$0);
   }

   public static erx.a a(eqw.b $$0) {
      return new erx.a(eut.a($$0));
   }

   public static class a extends esj.a<erx.a> {
      private final euv a;
      private final List<erx.b> b = Lists.newArrayList();

      a(euv $$0) {
         this.a = $$0;
      }

      public erx.a a(String $$0, String $$1, erx.c $$2) {
         try {
            this.b.add(new erx.b(fi.g.a($$0), fi.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public erx.a a(String $$0, String $$1) {
         return this.a($$0, $$1, erx.c.a);
      }

      protected erx.a a() {
         return this;
      }

      @Override
      public esk b() {
         return new erx(this.g(), this.a, this.b);
      }
   }

   static record b(fi.g b, fi.g c, erx.c d) {
      public static final Codec<erx.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fi.g.a.fieldOf("source").forGetter(erx.b::a), fi.g.a.fieldOf("target").forGetter(erx.b::b), erx.c.d.fieldOf("op").forGetter(erx.b::c))
               .apply($$0, erx.b::new)
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

      public fi.g a() {
         return this.b;
      }

      public fi.g b() {
         return this.c;
      }

      public erx.c c() {
         return this.d;
      }
   }

   public static enum c implements azc {
      a("replace") {
         @Override
         public void a(uu $$0, fi.g $$1, List<uu> $$2) throws CommandSyntaxException {
            $$1.a($$0, (uu)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(uu $$0, fi.g $$1, List<uu> $$2) throws CommandSyntaxException {
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
         public void a(uu $$0, fi.g $$1, List<uu> $$2) throws CommandSyntaxException {
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

      public static final Codec<erx.c> d = azc.a(erx.c::values);
      private final String e;

      public abstract void a(uu var1, fi.g var2, List<uu> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
