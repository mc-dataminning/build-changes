import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableObject;

public class epe extends epo {
   public static final Codec<epe> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(erw.a.fieldOf("source").forGetter($$0x -> $$0x.b), epe.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, epe::new)
   );
   private final erv b;
   private final List<epe.b> c;

   epe(List<erh> $$0, erv $$1, List<epe.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public epq b() {
      return epr.x;
   }

   @Override
   public Set<eqq<?>> a() {
      return this.b.b();
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      uv $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<ty> $$3 = new MutableObject();
         Supplier<uv> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(jz.a, cuq.a).c());
            }

            return (uv)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         ty $$5 = (ty)$$3.getValue();
         if ($$5 != null) {
            cuq.a(jz.a, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static epe.a a(erv $$0) {
      return new epe.a($$0);
   }

   public static epe.a a(eoa.b $$0) {
      return new epe.a(ert.a($$0));
   }

   public static class a extends epo.a<epe.a> {
      private final erv a;
      private final List<epe.b> b = Lists.newArrayList();

      a(erv $$0) {
         this.a = $$0;
      }

      public epe.a a(String $$0, String $$1, epe.c $$2) {
         try {
            this.b.add(new epe.b(epe.d.a($$0), epe.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public epe.a a(String $$0, String $$1) {
         return this.a($$0, $$1, epe.c.a);
      }

      protected epe.a a() {
         return this;
      }

      @Override
      public epp b() {
         return new epe(this.g(), this.a, this.b);
      }
   }

   static record b(epe.d b, epe.d c, epe.c d) {
      public static final Codec<epe.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  epe.d.a.fieldOf("source").forGetter(epe.b::a), epe.d.a.fieldOf("target").forGetter(epe.b::b), epe.c.d.fieldOf("op").forGetter(epe.b::c)
               )
               .apply($$0, epe.b::new)
      );

      public void a(Supplier<uv> $$0, uv $$1) {
         try {
            List<uv> $$2 = this.b.b().a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c.b(), $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public epe.d a() {
         return this.b;
      }

      public epe.d b() {
         return this.c;
      }

      public epe.c c() {
         return this.d;
      }
   }

   public static enum c implements ayq {
      a("replace") {
         @Override
         public void a(uv $$0, eu.g $$1, List<uv> $$2) throws CommandSyntaxException {
            $$1.a($$0, (uv)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(uv $$0, eu.g $$1, List<uv> $$2) throws CommandSyntaxException {
            List<uv> $$3 = $$1.a($$0, ue::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ue) {
                  $$2.forEach($$1xx -> ((ue)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(uv $$0, eu.g $$1, List<uv> $$2) throws CommandSyntaxException {
            List<uv> $$3 = $$1.a($$0, ty::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ty) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof ty) {
                        ((ty)$$1x).a((ty)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<epe.c> d = ayq.a(epe.c::values);
      private final String e;

      public abstract void a(uv var1, eu.g var2, List<uv> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   static record d(String b, eu.g c) {
      public static final Codec<epe.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, epe.d::a);

      public static epe.d a(String $$0) throws CommandSyntaxException {
         eu.g $$1 = new eu().a(new StringReader($$0));
         return new epe.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public eu.g b() {
         return this.c;
      }
   }
}
