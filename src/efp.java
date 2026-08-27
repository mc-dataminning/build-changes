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

public class efp extends efx {
   public static final Codec<efp> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ehz.a.fieldOf("source").forGetter($$0x -> $$0x.b), efp.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, efp::new)
   );
   private final ehy b;
   private final List<efp.b> c;

   efp(List<ehk> $$0, ehy $$1, List<efp.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public efz b() {
      return ega.w;
   }

   @Override
   public Set<egt<?>> a() {
      return this.b.b();
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      sw $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::w, $$2));
      }

      return $$0;
   }

   public static efp.a a(ehy $$0) {
      return new efp.a($$0);
   }

   public static efp.a a(eel.b $$0) {
      return new efp.a(ehw.a($$0));
   }

   public static class a extends efx.a<efp.a> {
      private final ehy a;
      private final List<efp.b> b = Lists.newArrayList();

      a(ehy $$0) {
         this.a = $$0;
      }

      public efp.a a(String $$0, String $$1, efp.c $$2) {
         try {
            this.b.add(new efp.b(efp.d.a($$0), efp.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public efp.a a(String $$0, String $$1) {
         return this.a($$0, $$1, efp.c.a);
      }

      protected efp.a a() {
         return this;
      }

      @Override
      public efy b() {
         return new efp(this.g(), this.a, this.b);
      }
   }

   static record b(efp.d b, efp.d c, efp.c d) {
      public static final Codec<efp.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  efp.d.a.fieldOf("source").forGetter(efp.b::a), efp.d.a.fieldOf("target").forGetter(efp.b::b), efp.c.d.fieldOf("op").forGetter(efp.b::c)
               )
               .apply($$0, efp.b::new)
      );

      public void a(Supplier<sw> $$0, sw $$1) {
         try {
            List<sw> $$2 = this.b.b().a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c.b(), $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public efp.d a() {
         return this.b;
      }

      public efp.d b() {
         return this.c;
      }

      public efp.c c() {
         return this.d;
      }
   }

   public static enum c implements aub {
      a("replace") {
         @Override
         public void a(sw $$0, el.g $$1, List<sw> $$2) throws CommandSyntaxException {
            $$1.a($$0, (sw)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(sw $$0, el.g $$1, List<sw> $$2) throws CommandSyntaxException {
            List<sw> $$3 = $$1.a($$0, sf::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof sf) {
                  $$2.forEach($$1xx -> ((sf)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(sw $$0, el.g $$1, List<sw> $$2) throws CommandSyntaxException {
            List<sw> $$3 = $$1.a($$0, rz::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof rz) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof rz) {
                        ((rz)$$1x).a((rz)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<efp.c> d = aub.a(efp.c::values);
      private final String e;

      public abstract void a(sw var1, el.g var2, List<sw> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   static record d(String b, el.g c) {
      public static final Codec<efp.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, efp.d::a);

      public static efp.d a(String $$0) throws CommandSyntaxException {
         el.g $$1 = new el().a(new StringReader($$0));
         return new efp.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public el.g b() {
         return this.c;
      }
   }
}
