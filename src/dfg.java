import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dfg {
   private static final Codec<ui[]> c = uk.b
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new ui[]{(ui)$$0x.get(0), (ui)$$0x.get(1), (ui)$$0x.get(2), (ui)$$0x.get(3)}),
         $$0 -> List.of($$0[0], $$0[1], $$0[2], $$0[3])
      );
   public static final Codec<dfg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               c.fieldOf("messages").forGetter($$0x -> $$0x.d),
               c.optionalFieldOf("filtered_messages").forGetter(dfg::d),
               cix.q.fieldOf("color").orElse(cix.p).forGetter($$0x -> $$0x.f),
               Codec.BOOL.fieldOf("has_glowing_text").orElse(false).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dfg::a)
   );
   public static final int b = 4;
   private final ui[] d;
   private final ui[] e;
   private final cix f;
   private final boolean g;
   @Nullable
   private ask[] h;
   private boolean i;

   public dfg() {
      this(c(), c(), cix.p, false);
   }

   public dfg(ui[] $$0, ui[] $$1, cix $$2, boolean $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
   }

   private static ui[] c() {
      return new ui[]{uh.a, uh.a, uh.a, uh.a};
   }

   private static dfg a(ui[] $$0, Optional<ui[]> $$1, cix $$2, boolean $$3) {
      return new dfg($$0, $$1.orElse(Arrays.copyOf($$0, $$0.length)), $$2, $$3);
   }

   public boolean a() {
      return this.g;
   }

   public dfg a(boolean $$0) {
      return $$0 == this.g ? this : new dfg(this.d, this.e, this.f, $$0);
   }

   public cix b() {
      return this.f;
   }

   public dfg a(cix $$0) {
      return $$0 == this.b() ? this : new dfg(this.d, this.e, $$0, this.g);
   }

   public ui a(int $$0, boolean $$1) {
      return this.b($$1)[$$0];
   }

   public dfg a(int $$0, ui $$1) {
      return this.a($$0, $$1, $$1);
   }

   public dfg a(int $$0, ui $$1, ui $$2) {
      ui[] $$3 = Arrays.copyOf(this.d, this.d.length);
      ui[] $$4 = Arrays.copyOf(this.e, this.e.length);
      $$3[$$0] = $$1;
      $$4[$$0] = $$2;
      return new dfg($$3, $$4, this.f, this.g);
   }

   public boolean a(ccx $$0) {
      return Arrays.stream(this.b($$0.W())).anyMatch($$0x -> !$$0x.getString().isEmpty());
   }

   public ui[] b(boolean $$0) {
      return $$0 ? this.e : this.d;
   }

   public ask[] a(boolean $$0, Function<ui, ask> $$1) {
      if (this.h == null || this.i != $$0) {
         this.i = $$0;
         this.h = new ask[4];

         for (int $$2 = 0; $$2 < 4; $$2++) {
            this.h[$$2] = $$1.apply(this.a($$2, $$0));
         }
      }

      return this.h;
   }

   private Optional<ui[]> d() {
      for (int $$0 = 0; $$0 < 4; $$0++) {
         if (!this.e[$$0].equals(this.d[$$0])) {
            return Optional.of(this.e);
         }
      }

      return Optional.empty();
   }

   public boolean b(ccx $$0) {
      for (ui $$1 : this.b($$0.W())) {
         vf $$2 = $$1.a();
         ug $$3 = $$2.h();
         if ($$3 != null && $$3.a() == ug.a.c) {
            return true;
         }
      }

      return false;
   }
}
