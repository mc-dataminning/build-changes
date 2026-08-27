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

public class eem extends eeu {
   public static final Codec<eem> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egw.a.fieldOf("source").forGetter($$0x -> $$0x.b), eem.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, eem::new)
   );
   private final egv b;
   private final List<eem.b> c;

   eem(List<egh> $$0, egv $$1, List<eem.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eew b() {
      return eex.w;
   }

   @Override
   public Set<efq<?>> a() {
      return this.b.b();
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      sn $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::w, $$2));
      }

      return $$0;
   }

   public static eem.a a(egv $$0) {
      return new eem.a($$0);
   }

   public static eem.a a(edi.b $$0) {
      return new eem.a(egt.a($$0));
   }

   public static class a extends eeu.a<eem.a> {
      private final egv a;
      private final List<eem.b> b = Lists.newArrayList();

      a(egv $$0) {
         this.a = $$0;
      }

      public eem.a a(String $$0, String $$1, eem.c $$2) {
         try {
            this.b.add(new eem.b(eem.d.a($$0), eem.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public eem.a a(String $$0, String $$1) {
         return this.a($$0, $$1, eem.c.a);
      }

      protected eem.a a() {
         return this;
      }

      @Override
      public eev b() {
         return new eem(this.g(), this.a, this.b);
      }
   }

   static record b(eem.d b, eem.d c, eem.c d) {
      public static final Codec<eem.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eem.d.a.fieldOf("source").forGetter(eem.b::a), eem.d.a.fieldOf("target").forGetter(eem.b::b), eem.c.d.fieldOf("op").forGetter(eem.b::c)
               )
               .apply($$0, eem.b::new)
      );

      public void a(Supplier<sn> $$0, sn $$1) {
         try {
            List<sn> $$2 = this.b.b().a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c.b(), $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public eem.d a() {
         return this.b;
      }

      public eem.d b() {
         return this.c;
      }

      public eem.c c() {
         return this.d;
      }
   }

   public static enum c implements atr {
      a("replace") {
         @Override
         public void a(sn $$0, el.g $$1, List<sn> $$2) throws CommandSyntaxException {
            $$1.a($$0, (sn)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(sn $$0, el.g $$1, List<sn> $$2) throws CommandSyntaxException {
            List<sn> $$3 = $$1.a($$0, rz::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof rz) {
                  $$2.forEach($$1xx -> ((rz)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(sn $$0, el.g $$1, List<sn> $$2) throws CommandSyntaxException {
            List<sn> $$3 = $$1.a($$0, rt::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof rt) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof rt) {
                        ((rt)$$1x).a((rt)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<eem.c> d = atr.a(eem.c::values);
      private final String e;

      public abstract void a(sn var1, el.g var2, List<sn> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   static record d(String b, el.g c) {
      public static final Codec<eem.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, eem.d::a);

      public static eem.d a(String $$0) throws CommandSyntaxException {
         el.g $$1 = new el().a(new StringReader($$0));
         return new eem.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public el.g b() {
         return this.c;
      }
   }
}
