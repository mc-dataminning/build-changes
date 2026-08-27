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

public class edu extends eec {
   public static final Codec<edu> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ege.a.fieldOf("source").forGetter($$0x -> $$0x.b), edu.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, edu::new)
   );
   private final egd b;
   private final List<edu.b> c;

   edu(List<efp> $$0, egd $$1, List<edu.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eee b() {
      return eef.w;
   }

   @Override
   public Set<eey<?>> a() {
      return this.b.b();
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      rq $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::w, $$2));
      }

      return $$0;
   }

   public static edu.a a(egd $$0) {
      return new edu.a($$0);
   }

   public static edu.a a(ecq.b $$0) {
      return new edu.a(egb.a($$0));
   }

   public static class a extends eec.a<edu.a> {
      private final egd a;
      private final List<edu.b> b = Lists.newArrayList();

      a(egd $$0) {
         this.a = $$0;
      }

      public edu.a a(String $$0, String $$1, edu.c $$2) {
         try {
            this.b.add(new edu.b(edu.d.a($$0), edu.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public edu.a a(String $$0, String $$1) {
         return this.a($$0, $$1, edu.c.a);
      }

      protected edu.a a() {
         return this;
      }

      @Override
      public eed b() {
         return new edu(this.g(), this.a, this.b);
      }
   }

   static record b(edu.d b, edu.d c, edu.c d) {
      public static final Codec<edu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  edu.d.a.fieldOf("source").forGetter(edu.b::a), edu.d.a.fieldOf("target").forGetter(edu.b::b), edu.c.d.fieldOf("op").forGetter(edu.b::c)
               )
               .apply($$0, edu.b::new)
      );

      public void a(Supplier<rq> $$0, rq $$1) {
         try {
            List<rq> $$2 = this.b.b().a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c.b(), $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public edu.d a() {
         return this.b;
      }

      public edu.d b() {
         return this.c;
      }

      public edu.c c() {
         return this.d;
      }
   }

   public static enum c implements asp {
      a("replace") {
         @Override
         public void a(rq $$0, ej.g $$1, List<rq> $$2) throws CommandSyntaxException {
            $$1.a($$0, (rq)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(rq $$0, ej.g $$1, List<rq> $$2) throws CommandSyntaxException {
            List<rq> $$3 = $$1.a($$0, rd::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof rd) {
                  $$2.forEach($$1xx -> ((rd)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(rq $$0, ej.g $$1, List<rq> $$2) throws CommandSyntaxException {
            List<rq> $$3 = $$1.a($$0, qx::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof qx) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof qx) {
                        ((qx)$$1x).a((qx)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<edu.c> d = asp.a(edu.c::values);
      private final String e;

      public abstract void a(rq var1, ej.g var2, List<rq> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   static record d(String b, ej.g c) {
      public static final Codec<edu.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, edu.d::a);

      public static edu.d a(String $$0) throws CommandSyntaxException {
         ej.g $$1 = new ej().a(new StringReader($$0));
         return new edu.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public ej.g b() {
         return this.c;
      }
   }
}
