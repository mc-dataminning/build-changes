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

public class eoo extends eox {
   public static final Codec<eoo> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(era.a.fieldOf("source").forGetter($$0x -> $$0x.b), eoo.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, eoo::new)
   );
   private final eqz b;
   private final List<eoo.b> c;

   eoo(List<eql> $$0, eqz $$1, List<eoo.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eoz b() {
      return epa.x;
   }

   @Override
   public Set<epu<?>> a() {
      return this.b.b();
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      ul $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<to> $$3 = new MutableObject();
         Supplier<ul> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(jr.a, cuc.a).c());
            }

            return (ul)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         to $$5 = (to)$$3.getValue();
         if ($$5 != null) {
            cuc.a(jr.a, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static eoo.a a(eqz $$0) {
      return new eoo.a($$0);
   }

   public static eoo.a a(enk.b $$0) {
      return new eoo.a(eqx.a($$0));
   }

   public static class a extends eox.a<eoo.a> {
      private final eqz a;
      private final List<eoo.b> b = Lists.newArrayList();

      a(eqz $$0) {
         this.a = $$0;
      }

      public eoo.a a(String $$0, String $$1, eoo.c $$2) {
         try {
            this.b.add(new eoo.b(eoo.d.a($$0), eoo.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public eoo.a a(String $$0, String $$1) {
         return this.a($$0, $$1, eoo.c.a);
      }

      protected eoo.a a() {
         return this;
      }

      @Override
      public eoy b() {
         return new eoo(this.g(), this.a, this.b);
      }
   }

   static record b(eoo.d b, eoo.d c, eoo.c d) {
      public static final Codec<eoo.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eoo.d.a.fieldOf("source").forGetter(eoo.b::a), eoo.d.a.fieldOf("target").forGetter(eoo.b::b), eoo.c.d.fieldOf("op").forGetter(eoo.b::c)
               )
               .apply($$0, eoo.b::new)
      );

      public void a(Supplier<ul> $$0, ul $$1) {
         try {
            List<ul> $$2 = this.b.b().a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c.b(), $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public eoo.d a() {
         return this.b;
      }

      public eoo.d b() {
         return this.c;
      }

      public eoo.c c() {
         return this.d;
      }
   }

   public static enum c implements ayg {
      a("replace") {
         @Override
         public void a(ul $$0, en.g $$1, List<ul> $$2) throws CommandSyntaxException {
            $$1.a($$0, (ul)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(ul $$0, en.g $$1, List<ul> $$2) throws CommandSyntaxException {
            List<ul> $$3 = $$1.a($$0, tu::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof tu) {
                  $$2.forEach($$1xx -> ((tu)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(ul $$0, en.g $$1, List<ul> $$2) throws CommandSyntaxException {
            List<ul> $$3 = $$1.a($$0, to::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof to) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof to) {
                        ((to)$$1x).a((to)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<eoo.c> d = ayg.a(eoo.c::values);
      private final String e;

      public abstract void a(ul var1, en.g var2, List<ul> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   static record d(String b, en.g c) {
      public static final Codec<eoo.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, eoo.d::a);

      public static eoo.d a(String $$0) throws CommandSyntaxException {
         en.g $$1 = new en().a(new StringReader($$0));
         return new eoo.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public en.g b() {
         return this.c;
      }
   }
}
