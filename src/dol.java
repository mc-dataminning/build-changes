import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class dol {
   static final String a = "shared_data";
   static Codec<dol> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               crj.a("display_item").forGetter($$0x -> $$0x.d),
               jf.c.optionalFieldOf("connected_players", Set.of()).forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("connected_particles_range", doj.b.d()).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dol::new)
   );
   private crj d = crj.i;
   private Set<UUID> e = new ObjectLinkedOpenHashSet();
   private double f = doj.b.d();
   boolean c;

   dol(crj $$0, Set<UUID> $$1, double $$2) {
      this.d = $$0;
      this.e.addAll($$1);
      this.f = $$2;
   }

   dol() {
   }

   public crj a() {
      return this.d;
   }

   public boolean b() {
      return !this.d.d();
   }

   public void a(crj $$0) {
      if (!crj.a(this.d, $$0)) {
         this.d = $$0.r();
         this.f();
      }
   }

   boolean c() {
      return !this.e.isEmpty();
   }

   Set<UUID> d() {
      return this.e;
   }

   double e() {
      return this.f;
   }

   void a(aps $$0, ib $$1, dok $$2, doj $$3, double $$4) {
      Set<UUID> $$5 = $$3.a().detect($$0, $$3.g(), $$1, $$4).stream().filter($$1x -> !$$2.b().contains($$1x)).collect(Collectors.toSet());
      if (!this.e.equals($$5)) {
         this.e = $$5;
         this.f();
      }
   }

   private void f() {
      this.c = true;
   }

   void a(dol $$0) {
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
   }
}
