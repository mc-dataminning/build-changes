import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class dxg {
   static final String a = "shared_data";
   static Codec<dxg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxo.a("display_item").forGetter($$0x -> $$0x.d),
               kk.c.lenientOptionalFieldOf("connected_players", Set.of()).forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.lenientOptionalFieldOf("connected_particles_range", dxe.b.d()).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dxg::new)
   );
   private cxo d = cxo.k;
   private Set<UUID> e = new ObjectLinkedOpenHashSet();
   private double f = dxe.b.d();
   boolean c;

   dxg(cxo $$0, Set<UUID> $$1, double $$2) {
      this.d = $$0;
      this.e.addAll($$1);
      this.f = $$2;
   }

   dxg() {
   }

   public cxo a() {
      return this.d;
   }

   public boolean b() {
      return !this.d.f();
   }

   public void a(cxo $$0) {
      if (!cxo.a(this.d, $$0)) {
         this.d = $$0.v();
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

   void a(ash $$0, jh $$1, dxf $$2, dxe $$3, double $$4) {
      Set<UUID> $$5 = $$3.a().detect($$0, $$3.g(), $$1, $$4, false).stream().filter($$1x -> !$$2.b().contains($$1x)).collect(Collectors.toSet());
      if (!this.e.equals($$5)) {
         this.e = $$5;
         this.f();
      }
   }

   private void f() {
      this.c = true;
   }

   void a(dxg $$0) {
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
   }
}
