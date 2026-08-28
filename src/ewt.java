import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableObject;

public class ewt extends exf {
   public static final MapCodec<ewt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ezq.a.fieldOf("source").forGetter($$0x -> $$0x.b), ewt.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, ewt::new)
   );
   private final ezp b;
   private final List<ewt.b> c;

   ewt(List<ezb> $$0, ezp $$1, List<ewt.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public exh<ewt> b() {
      return exi.C;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.b();
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      un $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<tq> $$3 = new MutableObject();
         Supplier<un> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(kv.b, cyz.a).d());
            }

            return (un)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         tq $$5 = (tq)$$3.getValue();
         if ($$5 != null) {
            cyz.a(kv.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static ewt.a a(ezp $$0) {
      return new ewt.a($$0);
   }

   public static ewt.a a(evs.b $$0) {
      return new ewt.a(ezn.a($$0));
   }

   public static class a extends exf.a<ewt.a> {
      private final ezp a;
      private final List<ewt.b> b = Lists.newArrayList();

      a(ezp $$0) {
         this.a = $$0;
      }

      public ewt.a a(String $$0, String $$1, ewt.c $$2) {
         try {
            this.b.add(new ewt.b(fp.g.a($$0), fp.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public ewt.a a(String $$0, String $$1) {
         return this.a($$0, $$1, ewt.c.a);
      }

      protected ewt.a a() {
         return this;
      }

      @Override
      public exg b() {
         return new ewt(this.g(), this.a, this.b);
      }
   }

   static record b(fp.g b, fp.g c, ewt.c d) {
      public static final Codec<ewt.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fp.g.a.fieldOf("source").forGetter(ewt.b::a), fp.g.a.fieldOf("target").forGetter(ewt.b::b), ewt.c.d.fieldOf("op").forGetter(ewt.b::c))
               .apply($$0, ewt.b::new)
      );

      public void a(Supplier<un> $$0, un $$1) {
         try {
            List<un> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public fp.g a() {
         return this.b;
      }

      public fp.g b() {
         return this.c;
      }

      public ewt.c c() {
         return this.d;
      }
   }

   public static enum c implements azv {
      a("replace") {
         @Override
         public void a(un $$0, fp.g $$1, List<un> $$2) throws CommandSyntaxException {
            $$1.a($$0, (un)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(un $$0, fp.g $$1, List<un> $$2) throws CommandSyntaxException {
            List<un> $$3 = $$1.a($$0, tw::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof tw) {
                  $$2.forEach($$1xx -> ((tw)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(un $$0, fp.g $$1, List<un> $$2) throws CommandSyntaxException {
            List<un> $$3 = $$1.a($$0, tq::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof tq) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof tq) {
                        ((tq)$$1x).a((tq)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<ewt.c> d = azv.a(ewt.c::values);
      private final String e;

      public abstract void a(un var1, fp.g var2, List<un> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
