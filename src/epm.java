import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableObject;

public class epm extends epw {
   public static final Codec<epm> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(esf.a.fieldOf("source").forGetter($$0x -> $$0x.b), epm.b.a.listOf().fieldOf("ops").forGetter($$0x -> $$0x.c)))
            .apply($$0, epm::new)
   );
   private final ese b;
   private final List<epm.b> c;

   epm(List<erq> $$0, ese $$1, List<epm.b> $$2) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
   }

   @Override
   public epy b() {
      return epz.z;
   }

   @Override
   public Set<eqz<?>> a() {
      return this.b.b();
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      ux $$2 = this.b.a($$1);
      if ($$2 == null) {
         return $$0;
      } else {
         MutableObject<ua> $$3 = new MutableObject();
         Supplier<ux> $$4 = () -> {
            if ($$3.getValue() == null) {
               $$3.setValue($$0.a(ka.a, cvm.a).c());
            }

            return (ux)$$3.getValue();
         };
         this.c.forEach($$2x -> $$2x.a($$4, $$2));
         ua $$5 = (ua)$$3.getValue();
         if ($$5 != null) {
            cvm.a(ka.a, $$0, $$5);
         }

         return $$0;
      }
   }

   @Deprecated
   public static epm.a a(ese $$0) {
      return new epm.a($$0);
   }

   public static epm.a a(eol.b $$0) {
      return new epm.a(esc.a($$0));
   }

   public static class a extends epw.a<epm.a> {
      private final ese a;
      private final List<epm.b> b = Lists.newArrayList();

      a(ese $$0) {
         this.a = $$0;
      }

      public epm.a a(String $$0, String $$1, epm.c $$2) {
         try {
            this.b.add(new epm.b(ev.g.a($$0), ev.g.a($$1), $$2));
            return this;
         } catch (CommandSyntaxException var5) {
            throw new IllegalArgumentException(var5);
         }
      }

      public epm.a a(String $$0, String $$1) {
         return this.a($$0, $$1, epm.c.a);
      }

      protected epm.a a() {
         return this;
      }

      @Override
      public epx b() {
         return new epm(this.g(), this.a, this.b);
      }
   }

   static record b(ev.g b, ev.g c, epm.c d) {
      public static final Codec<epm.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ev.g.a.fieldOf("source").forGetter(epm.b::a), ev.g.a.fieldOf("target").forGetter(epm.b::b), epm.c.d.fieldOf("op").forGetter(epm.b::c))
               .apply($$0, epm.b::new)
      );

      public void a(Supplier<ux> $$0, ux $$1) {
         try {
            List<ux> $$2 = this.b.a($$1);
            if (!$$2.isEmpty()) {
               this.d.a($$0.get(), this.c, $$2);
            }
         } catch (CommandSyntaxException var4) {
         }
      }

      public ev.g a() {
         return this.b;
      }

      public ev.g b() {
         return this.c;
      }

      public epm.c c() {
         return this.d;
      }
   }

   public static enum c implements ayt {
      a("replace") {
         @Override
         public void a(ux $$0, ev.g $$1, List<ux> $$2) throws CommandSyntaxException {
            $$1.a($$0, (ux)Iterables.getLast($$2));
         }
      },
      b("append") {
         @Override
         public void a(ux $$0, ev.g $$1, List<ux> $$2) throws CommandSyntaxException {
            List<ux> $$3 = $$1.a($$0, ug::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ug) {
                  $$2.forEach($$1xx -> ((ug)$$1x).add($$1xx.d()));
               }
            });
         }
      },
      c("merge") {
         @Override
         public void a(ux $$0, ev.g $$1, List<ux> $$2) throws CommandSyntaxException {
            List<ux> $$3 = $$1.a($$0, ua::new);
            $$3.forEach($$1x -> {
               if ($$1x instanceof ua) {
                  $$2.forEach($$1xx -> {
                     if ($$1xx instanceof ua) {
                        ((ua)$$1x).a((ua)$$1xx);
                     }
                  });
               }
            });
         }
      };

      public static final Codec<epm.c> d = ayt.a(epm.c::values);
      private final String e;

      public abstract void a(ux var1, ev.g var2, List<ux> var3) throws CommandSyntaxException;

      c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
