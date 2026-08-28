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

public class eum extends euy {
   public static final MapCodec<eum> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(exl.a.fieldOf("source").forGetter($$0x -> $$0x.b), eum.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, eum::new)
   );
   private final exk b;
   private final List<eum.b> c;

   eum(List<eww> $$0, exk $$1, List<eum.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public eva<eum> b() {
      return evb.C;
   }

   @Override
   public Set<ewe<?>> a() {
      return this.b.b();
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      vd $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<ug> $$3 = new MutableObject();
         Supplier<vd> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(ks.b, cyh.a).c());
            }

            return (vd)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         ug $$5 = (ug)$$3.getValue();
         if ($$5 != null) {
            cyh.a(ks.b, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static eum.a a(exk $$0) {
      return new eum.a($$0);
   }

   public static eum.a a(etl.b $$0) {
      return new eum.a(exi.a($$0));
   }

   public static class a extends euy.a<eum.a> {
      private final exk a;
      private final List<eum.b> b = Lists.newArrayList();

      a(exk $$0) {
         this.a = $$0;
      }

      public eum.a a(String $$0, String $$1, eum.c $$2) {
         try {
            this.b.add(new eum.b(fm.g.a($$0), fm.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public eum.a a(String $$0, String $$1) {
         return this.a($$0, $$1, eum.c.a);
      }

      protected eum.a a() {
         return this;
      }

      @Override
      public euz b() {
         return new eum(this.g(), this.a, this.b);
      }
   }

   static record b(fm.g b, fm.g c, eum.c d) {
      public static final Codec<eum.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fm.g.a.fieldOf("source").forGetter(eum.b::a), fm.g.a.fieldOf("target").forGetter(eum.b::b), eum.c.d.fieldOf("op").forGetter(eum.b::c))
               .apply($$0, eum.b::new)
      );

      public void a(Supplier<vd> $$0, vd $$1) {
         try {
            List<vd> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public fm.g a() {
         return this.b;
      }

      public fm.g b() {
         return this.c;
      }

      public eum.c c() {
         return this.d;
      }
   }

   public static enum c implements bab {
      a("replace") {
         @Override
         public void a(vd $$0, fm.g $$1, List<vd> $$2) throws CommandSyntaxException {
            $$1.a($$0, (vd)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(vd $$0, fm.g $$1, List<vd> $$2) throws CommandSyntaxException {
            List<vd> $$3 = $$1.a($$0, um::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof um) {
                  $$2.forEach($$1xx -> ((um)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(vd $$0, fm.g $$1, List<vd> $$2) throws CommandSyntaxException {
            List<vd> $$3 = $$1.a($$0, ug::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ug) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof ug) {
                        ((ug)$$1x).a((ug)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<eum.c> d = bab.a(eum.c::values);
      private final String e;

      public abstract void a(vd var1, fm.g var2, List<vd> var3) throws CommandSyntaxException;

      c(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
