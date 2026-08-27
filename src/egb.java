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

public class egb extends egj {
   public static final Codec<egb> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eil.a.fieldOf("source").forGetter($$0x -> $$0x.b), egb.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, egb::new)
   );
   private final eik b;
   private final List<egb.b> c;

   egb(List<ehw> $$0, eik $$1, List<egb.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public egl b() {
      return egm.w;
   }

   @Override
   public Set<ehf<?>> a() {
      return this.b.b();
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      sw $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::w, $$2));
      }

      return $$0;
   }

   public static egb.a a(eik $$0) {
      return new egb.a($$0);
   }

   public static egb.a a(eex.b $$0) {
      return new egb.a(eii.a($$0));
   }

   public static class a extends egj.a<egb.a> {
      private final eik a;
      private final List<egb.b> b = Lists.newArrayList();

      a(eik $$0) {
         this.a = $$0;
      }

      public egb.a a(String $$0, String $$1, egb.c $$2) {
         try {
            this.b.add(new egb.b(egb.d.a($$0), egb.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public egb.a a(String $$0, String $$1) {
         return this.a($$0, $$1, egb.c.a);
      }

      protected egb.a a() {
         return this;
      }

      @Override
      public egk b() {
         return new egb(this.g(), this.a, this.b);
      }
   }

   static record b(egb.d b, egb.d c, egb.c d) {
      public static final Codec<egb.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  egb.d.a.fieldOf("source").forGetter(egb.b::a), egb.d.a.fieldOf("target").forGetter(egb.b::b), egb.c.d.fieldOf("op").forGetter(egb.b::c)
               )
               .apply($$0, egb.b::new)
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

      public egb.d a() {
         return this.b;
      }

      public egb.d b() {
         return this.c;
      }

      public egb.c c() {
         return this.d;
      }
   }

   public static enum c implements aug {
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

      public static final Codec<egb.c> d = aug.a(egb.c::values);
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
      public static final Codec<egb.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, egb.d::a);

      public static egb.d a(String $$0) throws CommandSyntaxException {
         el.g $$1 = new el().a(new StringReader($$0));
         return new egb.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public el.g b() {
         return this.c;
      }
   }
}
