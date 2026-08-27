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

public class ejz extends ekh {
   public static final Codec<ejz> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(emj.a.fieldOf("source").forGetter($$0x -> $$0x.b), ejz.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, ejz::new)
   );
   private final emi b;
   private final List<ejz.b> c;

   ejz(List<elu> $$0, emi $$1, List<ejz.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public ekj b() {
      return ekk.w;
   }

   @Override
   public Set<eld<?>> a() {
      return this.b.b();
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      tt $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::x, $$2));
      }

      return $$0;
   }

   public static ejz.a a(emi $$0) {
      return new ejz.a($$0);
   }

   public static ejz.a a(eiv.b $$0) {
      return new ejz.a(emg.a($$0));
   }

   public static class a extends ekh.a<ejz.a> {
      private final emi a;
      private final List<ejz.b> b = Lists.newArrayList();

      a(emi $$0) {
         this.a = $$0;
      }

      public ejz.a a(String $$0, String $$1, ejz.c $$2) {
         try {
            this.b.add(new ejz.b(ejz.d.a($$0), ejz.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public ejz.a a(String $$0, String $$1) {
         return this.a($$0, $$1, ejz.c.a);
      }

      protected ejz.a a() {
         return this;
      }

      @Override
      public eki b() {
         return new ejz(this.g(), this.a, this.b);
      }
   }

   static record b(ejz.d b, ejz.d c, ejz.c d) {
      public static final Codec<ejz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ejz.d.a.fieldOf("source").forGetter(ejz.b::a), ejz.d.a.fieldOf("target").forGetter(ejz.b::b), ejz.c.d.fieldOf("op").forGetter(ejz.b::c)
               )
               .apply($$0, ejz.b::new)
      );

      public void a(Supplier<tt> $$0, tt $$1) {
         try {
            List<tt> $$2 = this.b.b().a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c.b(), $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public ejz.d a() {
         return this.b;
      }

      public ejz.d b() {
         return this.c;
      }

      public ejz.c c() {
         return this.d;
      }
   }

   public static enum c implements axc {
      a("replace") {
         @Override
         public void a(tt $$0, em.g $$1, List<tt> $$2) throws CommandSyntaxException {
            $$1.a($$0, (tt)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(tt $$0, em.g $$1, List<tt> $$2) throws CommandSyntaxException {
            List<tt> $$3 = $$1.a($$0, tc::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof tc) {
                  $$2.forEach($$1xx -> ((tc)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(tt $$0, em.g $$1, List<tt> $$2) throws CommandSyntaxException {
            List<tt> $$3 = $$1.a($$0, sw::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof sw) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof sw) {
                        ((sw)$$1x).a((sw)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<ejz.c> d = axc.a(ejz.c::values);
      private final String e;

      public abstract void a(tt var1, em.g var2, List<tt> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   static record d(String b, em.g c) {
      public static final Codec<ejz.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, ejz.d::a);

      public static ejz.d a(String $$0) throws CommandSyntaxException {
         em.g $$1 = new em().a(new StringReader($$0));
         return new ejz.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public em.g b() {
         return this.c;
      }
   }
}
