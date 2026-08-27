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

public class ekg extends eko {
   public static final Codec<ekg> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(emq.a.fieldOf("source").forGetter($$0x -> $$0x.b), ekg.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, ekg::new)
   );
   private final emp b;
   private final List<ekg.b> c;

   ekg(List<emb> $$0, emp $$1, List<ekg.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public ekq b() {
      return ekr.w;
   }

   @Override
   public Set<elk<?>> a() {
      return this.b.b();
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      tt $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::x, $$2));
      }

      return $$0;
   }

   public static ekg.a a(emp $$0) {
      return new ekg.a($$0);
   }

   public static ekg.a a(ejc.b $$0) {
      return new ekg.a(emn.a($$0));
   }

   public static class a extends eko.a<ekg.a> {
      private final emp a;
      private final List<ekg.b> b = Lists.newArrayList();

      a(emp $$0) {
         this.a = $$0;
      }

      public ekg.a a(String $$0, String $$1, ekg.c $$2) {
         try {
            this.b.add(new ekg.b(ekg.d.a($$0), ekg.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public ekg.a a(String $$0, String $$1) {
         return this.a($$0, $$1, ekg.c.a);
      }

      protected ekg.a a() {
         return this;
      }

      @Override
      public ekp b() {
         return new ekg(this.g(), this.a, this.b);
      }
   }

   static record b(ekg.d b, ekg.d c, ekg.c d) {
      public static final Codec<ekg.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ekg.d.a.fieldOf("source").forGetter(ekg.b::a), ekg.d.a.fieldOf("target").forGetter(ekg.b::b), ekg.c.d.fieldOf("op").forGetter(ekg.b::c)
               )
               .apply($$0, ekg.b::new)
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

      public ekg.d a() {
         return this.b;
      }

      public ekg.d b() {
         return this.c;
      }

      public ekg.c c() {
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

      public static final Codec<ekg.c> d = axc.a(ekg.c::values);
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
      public static final Codec<ekg.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, ekg.d::a);

      public static ekg.d a(String $$0) throws CommandSyntaxException {
         em.g $$1 = new em().a(new StringReader($$0));
         return new ekg.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public em.g b() {
         return this.c;
      }
   }
}
