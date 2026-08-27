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

public class ehi extends ehq {
   public static final Codec<ehi> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ejs.a.fieldOf("source").forGetter($$0x -> $$0x.b), ehi.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, ehi::new)
   );
   private final ejr b;
   private final List<ehi.b> c;

   ehi(List<ejd> $$0, ejr $$1, List<ehi.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public ehs b() {
      return eht.w;
   }

   @Override
   public Set<eim<?>> a() {
      return this.b.b();
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      tg $$2 = this.b.a($$1);
      if ($$2 != null) {
         this.c.forEach($$2x -> $$2x.a($$0::w, $$2));
      }

      return $$0;
   }

   public static ehi.a a(ejr $$0) {
      return new ehi.a($$0);
   }

   public static ehi.a a(ege.b $$0) {
      return new ehi.a(ejp.a($$0));
   }

   public static class a extends ehq.a<ehi.a> {
      private final ejr a;
      private final List<ehi.b> b = Lists.newArrayList();

      a(ejr $$0) {
         this.a = $$0;
      }

      public ehi.a a(String $$0, String $$1, ehi.c $$2) {
         try {
            this.b.add(new ehi.b(ehi.d.a($$0), ehi.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public ehi.a a(String $$0, String $$1) {
         return this.a($$0, $$1, ehi.c.a);
      }

      protected ehi.a a() {
         return this;
      }

      @Override
      public ehr b() {
         return new ehi(this.g(), this.a, this.b);
      }
   }

   static record b(ehi.d b, ehi.d c, ehi.c d) {
      public static final Codec<ehi.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ehi.d.a.fieldOf("source").forGetter(ehi.b::a), ehi.d.a.fieldOf("target").forGetter(ehi.b::b), ehi.c.d.fieldOf("op").forGetter(ehi.b::c)
               )
               .apply($$0, ehi.b::new)
      );

      public void a(Supplier<tg> $$0, tg $$1) {
         try {
            List<tg> $$2 = this.b.b().a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c.b(), $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public ehi.d a() {
         return this.b;
      }

      public ehi.d b() {
         return this.c;
      }

      public ehi.c c() {
         return this.d;
      }
   }

   public static enum c implements aut {
      a("replace") {
         @Override
         public void a(tg $$0, ej.g $$1, List<tg> $$2) throws CommandSyntaxException {
            $$1.a($$0, (tg)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(tg $$0, ej.g $$1, List<tg> $$2) throws CommandSyntaxException {
            List<tg> $$3 = $$1.a($$0, sp::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof sp) {
                  $$2.forEach($$1xx -> ((sp)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(tg $$0, ej.g $$1, List<tg> $$2) throws CommandSyntaxException {
            List<tg> $$3 = $$1.a($$0, sj::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof sj) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof sj) {
                        ((sj)$$1x).a((sj)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<ehi.c> d = aut.a(ehi.c::values);
      private final String e;

      public abstract void a(tg var1, ej.g var2, List<tg> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   static record d(String b, ej.g c) {
      public static final Codec<ehi.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, ehi.d::a);

      public static ehi.d a(String $$0) throws CommandSyntaxException {
         ej.g $$1 = new ej().a(new StringReader($$0));
         return new ehi.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public ej.g b() {
         return this.c;
      }
   }
}
