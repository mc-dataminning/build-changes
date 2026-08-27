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

public class edo extends edw {
   public static final Codec<edo> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(efy.a.fieldOf("source").forGetter($$0x -> $$0x.b), edo.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, edo::new)
   );
   private final efx b;
   private final List<edo.b> c;

   edo(List<efj> $$0, efx $$1, List<edo.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public edy b() {
      return edz.w;
   }

   @Override
   public Set<ees<?>> a() {
      return this.b.b();
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      rq $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::w, $$2));
      }

      return $$0;
   }

   public static edo.a a(efx $$0) {
      return new edo.a($$0);
   }

   public static edo.a a(eck.b $$0) {
      return new edo.a(efv.a($$0));
   }

   public static class a extends edw.a<edo.a> {
      private final efx a;
      private final List<edo.b> b = Lists.newArrayList();

      a(efx $$0) {
         this.a = $$0;
      }

      public edo.a a(String $$0, String $$1, edo.c $$2) {
         try {
            this.b.add(new edo.b(edo.d.a($$0), edo.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public edo.a a(String $$0, String $$1) {
         return this.a($$0, $$1, edo.c.a);
      }

      protected edo.a a() {
         return this;
      }

      @Override
      public edx b() {
         return new edo(this.g(), this.a, this.b);
      }
   }

   static record b(edo.d b, edo.d c, edo.c d) {
      public static final Codec<edo.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  edo.d.a.fieldOf("source").forGetter(edo.b::a), edo.d.a.fieldOf("target").forGetter(edo.b::b), edo.c.d.fieldOf("op").forGetter(edo.b::c)
               )
               .apply($$0, edo.b::new)
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

      public edo.d a() {
         return this.b;
      }

      public edo.d b() {
         return this.c;
      }

      public edo.c c() {
         return this.d;
      }
   }

   public static enum c implements asu {
      a("replace") {
         @Override
         public void a(rq $$0, ej.g $$1, List<rq> $$2) throws CommandSyntaxException {
            $$1.a($$0, (rq)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(rq $$0, ej.g $$1, List<rq> $$2) throws CommandSyntaxException {
            List<rq> $$3 = $$1.a($$0, rc::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof rc) {
                  $$2.forEach($$1xx -> ((rc)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(rq $$0, ej.g $$1, List<rq> $$2) throws CommandSyntaxException {
            List<rq> $$3 = $$1.a($$0, qw::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof qw) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof qw) {
                        ((qw)$$1x).a((qw)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<edo.c> d = asu.a(edo.c::values);
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
      public static final Codec<edo.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, edo.d::a);

      public static edo.d a(String $$0) throws CommandSyntaxException {
         ej.g $$1 = new ej().a(new StringReader($$0));
         return new edo.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public ej.g b() {
         return this.c;
      }
   }
}
