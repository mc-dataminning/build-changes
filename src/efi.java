import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class efi extends eeu {
   public static final Codec<efi> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  uk.a.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  asg.a(edi.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, efi::new)
   );
   private final boolean b;
   private final List<ui> c;
   private final Optional<edi.b> d;

   public efi(List<egh> $$0, boolean $$1, List<ui> $$2, Optional<edi.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public eew b() {
      return eex.u;
   }

   @Override
   public Set<efq<?>> a() {
      return this.d.<Set<efq<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      rz $$2 = this.a($$0, !this.c.isEmpty());
      if ($$2 != null) {
         if (this.b) {
            $$2.clear();
         }

         UnaryOperator<ui> $$3 = efj.a($$1, this.d.orElse(null));
         this.c.stream().map($$3).map(ui.a::a).map(sl::a).forEach($$2::add);
      }

      return $$0;
   }

   @Nullable
   private rz a(ckj $$0, boolean $$1) {
      rt $$2;
      if ($$0.u()) {
         $$2 = $$0.v();
      } else {
         if (!$$1) {
            return null;
         }

         $$2 = new rt();
         $$0.c($$2);
      }

      rt $$5;
      if ($$2.b("display", 10)) {
         $$5 = $$2.p("display");
      } else {
         if (!$$1) {
            return null;
         }

         $$5 = new rt();
         $$2.a("display", $$5);
      }

      if ($$5.b("Lore", 9)) {
         return $$5.c("Lore", 8);
      } else if ($$1) {
         rz $$8 = new rz();
         $$5.a("Lore", $$8);
         return $$8;
      } else {
         return null;
      }
   }

   public static efi.a c() {
      return new efi.a();
   }

   public static class a extends eeu.a<efi.a> {
      private boolean a;
      private Optional<edi.b> b = Optional.empty();
      private final Builder<ui> c = ImmutableList.builder();

      public efi.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public efi.a a(edi.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public efi.a a(ui $$0) {
         this.c.add($$0);
         return this;
      }

      protected efi.a a() {
         return this;
      }

      @Override
      public eev b() {
         return new efi(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
