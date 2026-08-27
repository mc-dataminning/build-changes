import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class ftr<T extends bfz & byd, M extends fbf<T> & fdp> extends ftg<T, M> {
   private static final Int2ObjectMap<acq> a = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, new acq("stone"));
      $$0.put(2, new acq("iron"));
      $$0.put(3, new acq("gold"));
      $$0.put(4, new acq("emerald"));
      $$0.put(5, new acq("diamond"));
   });
   private final Object2ObjectMap<byg, fwh.a> b = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<bye, fwh.a> c = new Object2ObjectOpenHashMap();
   private final akx d;
   private final String e;

   public ftr(fqt<T, M> $$0, akx $$1, String $$2) {
      super($$0);
      this.d = $$1;
      this.e = $$2;
   }

   public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cb()) {
         byc $$10 = $$3.gj();
         byg $$11 = $$10.a();
         bye $$12 = $$10.b();
         fwh.a $$13 = this.a(this.b, "type", jb.z, $$11);
         fwh.a $$14 = this.a(this.c, "profession", jb.A, $$12);
         M $$15 = this.c();
         $$15.a($$14 == fwh.a.a || $$14 == fwh.a.b && $$13 != fwh.a.c);
         acq $$16 = this.a("type", jb.z.b($$11));
         a($$15, $$16, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         $$15.a(true);
         if ($$12 != bye.b && !$$3.h_()) {
            acq $$17 = this.a("profession", jb.A.b($$12));
            a($$15, $$17, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            if ($$12 != bye.m) {
               acq $$18 = this.a("profession_level", (acq)a.get(apa.a($$10.c(), 1, a.size())));
               a($$15, $$18, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
            }
         }
      }
   }

   private acq a(String $$0, acq $$1) {
      return $$1.a((UnaryOperator<String>)($$1x -> "textures/entity/" + this.e + "/" + $$0 + "/" + $$1x + ".png"));
   }

   public <K> fwh.a a(Object2ObjectMap<K, fwh.a> $$0, String $$1, gz<K> $$2, K $$3) {
      return (fwh.a)$$0.computeIfAbsent($$3, $$3x -> this.d.getResource(this.a($$1, $$2.b($$3))).flatMap($$0xx -> {
            try {
               return $$0xx.f().a(fwh.a).map(fwh::a);
            } catch (IOException var2x) {
               return Optional.empty();
            }
         }).orElse(fwh.a.a));
   }
}
