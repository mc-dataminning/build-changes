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

public class eof extends eoo {
   public static final Codec<eof> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eqr.a.fieldOf("source").forGetter($$0x -> $$0x.b), eof.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, eof::new)
   );
   private final eqq b;
   private final List<eof.b> c;

   eof(List<eqc> $$0, eqq $$1, List<eof.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eoq b() {
      return eor.x;
   }

   @Override
   public Set<epl<?>> a() {
      return this.b.b();
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      uj $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<tm> $$3 = new MutableObject();
         Supplier<uj> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(jp.a, ctt.a).c());
            }

            return (uj)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         tm $$5 = (tm)$$3.getValue();
         if ($$5 != null) {
            ctt.a(jp.a, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static eof.a a(eqq $$0) {
      return new eof.a($$0);
   }

   public static eof.a a(enb.b $$0) {
      return new eof.a(eqo.a($$0));
   }

   public static class a extends eoo.a<eof.a> {
      private final eqq a;
      private final List<eof.b> b = Lists.newArrayList();

      a(eqq $$0) {
         this.a = $$0;
      }

      public eof.a a(String $$0, String $$1, eof.c $$2) {
         try {
            this.b.add(new eof.b(eof.d.a($$0), eof.d.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public eof.a a(String $$0, String $$1) {
         return this.a($$0, $$1, eof.c.a);
      }

      protected eof.a a() {
         return this;
      }

      @Override
      public eop b() {
         return new eof(this.g(), this.a, this.b);
      }
   }

   static record b(eof.d b, eof.d c, eof.c d) {
      public static final Codec<eof.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  eof.d.a.fieldOf("source").forGetter(eof.b::a), eof.d.a.fieldOf("target").forGetter(eof.b::b), eof.c.d.fieldOf("op").forGetter(eof.b::c)
               )
               .apply($$0, eof.b::new)
      );

      public void a(Supplier<uj> $$0, uj $$1) {
         try {
            List<uj> $$2 = this.b.b().a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c.b(), $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public eof.d a() {
         return this.b;
      }

      public eof.d b() {
         return this.c;
      }

      public eof.c c() {
         return this.d;
      }
   }

   public static enum c implements aye {
      a("replace") {
         @Override
         public void a(uj $$0, em.g $$1, List<uj> $$2) throws CommandSyntaxException {
            $$1.a($$0, (uj)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(uj $$0, em.g $$1, List<uj> $$2) throws CommandSyntaxException {
            List<uj> $$3 = $$1.a($$0, ts::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ts) {
                  $$2.forEach($$1xx -> ((ts)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(uj $$0, em.g $$1, List<uj> $$2) throws CommandSyntaxException {
            List<uj> $$3 = $$1.a($$0, tm::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof tm) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof tm) {
                        ((tm)$$1x).a((tm)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<eof.c> d = aye.a(eof.c::values);
      private final String e;

      public abstract void a(uj var1, em.g var2, List<uj> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   static record d(String b, em.g c) {
      public static final Codec<eof.d> a = Codec.STRING.comapFlatMap($$0 -> {
         try {
            return DataResult.success(a($$0));
         } catch (CommandSyntaxException var2) {
            return DataResult.error(() -> "Failed to parse path " + $$0 + ": " + var2.getMessage());
         }
      }, eof.d::a);

      public static eof.d a(String $$0) throws CommandSyntaxException {
         em.g $$1 = new em().a(new StringReader($$0));
         return new eof.d($$0, $$1);
      }

      public String a() {
         return this.b;
      }

      public em.g b() {
         return this.c;
      }
   }
}
