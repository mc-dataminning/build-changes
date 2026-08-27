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

public class egg extends ego {
   public static final Codec<egg> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eiq.a.fieldOf("source").forGetter($$0x -> $$0x.b), egg.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, egg::new)
   );
   private final eip b;
   private final List<egg.b> c;

   egg(List<eib> $$0, eip $$1, List<egg.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public egq b() {
      return egr.w;
   }

   @Override
   public Set<ehk<?>> a() {
      return this.b.b();
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      ta $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::w, $$2));
      }

      return $$0;
   }

   public static egg.a a(eip $$0) {
      return new egg.a($$0);
   }

   public static egg.a a(efc.b $$0) {
      return new egg.a(ein.a($$0));
   }

   public static class a extends ego.a<egg.a> {
      private final eip a;
      private final List<egg.b> b = Lists.newArrayList();

      a(eip $$0) {
         this.a = $$0;
      }

      public egg.a a(String $$0, String $$1, egg.c $$2) {
         try {
            this.b.add(new egg.b(egg.d.a($$0), egg.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public egg.a a(String $$0, String $$1) {
         return this.a($$0, $$1, egg.c.a);
      }

      protected egg.a a() {
         return this;
      }

      @Override
      public egp b() {
         return new egg(this.g(), this.a, this.b);
      }
   }

   static record b(egg.d b, egg.d c, egg.c d) {
      public static final Codec<egg.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  egg.d.a.fieldOf("source").forGetter(egg.b::a), egg.d.a.fieldOf("target").forGetter(egg.b::b), egg.c.d.fieldOf("op").forGetter(egg.b::c)
               )
               .apply($$0, egg.b::new)
      );

      public void a(Supplier<ta> $$0, ta $$1) {
         try {
            List<ta> $$2 = this.b.b().a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c.b(), $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public egg.d a() {
         return this.b;
      }

      public egg.d b() {
         return this.c;
      }

      public egg.c c() {
         return this.d;
      }
   }

   public static enum c implements auk {
      a("replace") {
         @Override
         public void a(ta $$0, el.g $$1, List<ta> $$2) throws CommandSyntaxException {
            $$1.a($$0, (ta)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(ta $$0, el.g $$1, List<ta> $$2) throws CommandSyntaxException {
            List<ta> $$3 = $$1.a($$0, sj::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof sj) {
                  $$2.forEach($$1xx -> ((sj)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(ta $$0, el.g $$1, List<ta> $$2) throws CommandSyntaxException {
            List<ta> $$3 = $$1.a($$0, sd::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof sd) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof sd) {
                        ((sd)$$1x).a((sd)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<egg.c> d = auk.a(egg.c::values);
      private final String e;

      public abstract void a(ta var1, el.g var2, List<ta> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   static record d(String b, el.g c) {
      public static final Codec<egg.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, egg.d::a);

      public static egg.d a(String $$0) throws CommandSyntaxException {
         el.g $$1 = new el().a(new StringReader($$0));
         return new egg.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public el.g b() {
         return this.c;
      }
   }
}
