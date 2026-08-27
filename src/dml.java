import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class dml {
   static final String a = "shared_data";
   static Codec<dml> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cqk.a("display_item").forGetter($$0x -> $$0x.d),
               jf.c.optionalFieldOf("connected_players", Set.of()).forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("connected_particles_range", dmj.b.d()).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dml::new)
   );
   private cqk d = cqk.h;
   private Set<UUID> e = new ObjectLinkedOpenHashSet();
   private double f = dmj.b.d();
   boolean c;

   dml(cqk $$0, Set<UUID> $$1, double $$2) {
      this.d = $$0;
      this.e.addAll($$1);
      this.f = $$2;
   }

   dml() {
   }

   public cqk a() {
      return this.d;
   }

   public boolean b() {
      return !this.d.b();
   }

   public void a(cqk $$0) {
      if (!cqk.a(this.d, $$0)) {
         this.d = $$0.q();
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

   void a(apf $$0, ib $$1, dmk $$2, dmj $$3, double $$4) {
      Set<UUID> $$5 = $$3.a().detect($$0, $$3.g(), $$1, $$4).stream().filter($$1x -> !$$2.b().contains($$1x)).collect(Collectors.toSet());
      if (!this.e.equals($$5)) {
         this.e = $$5;
         this.f();
      }
   }

   private void f() {
      this.c = true;
   }

   void a(dml $$0) {
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
   }
}
