import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class emu extends emg {
   public static final Codec<emu> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  vw.a.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  awe.a(eku.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, emu::new)
   );
   private final boolean b;
   private final List<vu> c;
   private final Optional<eku.b> d;

   public emu(List<ent> $$0, boolean $$1, List<vu> $$2, Optional<eku.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public emi b() {
      return emj.u;
   }

   @Override
   public Set<enc<?>> a() {
      return this.d.<Set<enc<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      tg $$2 = this.a($$0, !this.c.isEmpty());
      if ($$2 != null) {
         if (this.b) {
            $$2.clear();
         }

         UnaryOperator<vu> $$3 = emv.a($$1, this.d.orElse(null));
         this.c.stream().map($$3).map(vu.a::a).map(tv::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private tg a(cqk $$0, boolean $$1) {
      ta $$2;
      if ($$0.v()) {
         $$2 = $$0.w();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new ta();
         $$0.c($$2);
      }

      ta $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new ta();
         $$2.a("display", $$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         tg $$8 = new tg();
         $$5.a("Lore", $$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static emu.a c() {
      return new emu.a();
   }

   public static class a extends emg.a<emu.a> {
      private boolean a;
      private Optional<eku.b> b = Optional.empty();
      private final Builder<vu> c = ImmutableList.builder();

      public emu.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public emu.a a(eku.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public emu.a a(vu $$0) {
         this.c.add($$0);
         return this;
      }

      protected emu.a a() {
         return this;
      }

      @Override
      public emh b() {
         return new emu(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
