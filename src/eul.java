public class eul {
   private static final alk[] a = new alk[]{
      alk.b("nether_fossils/fossil_1"),
      alk.b("nether_fossils/fossil_2"),
      alk.b("nether_fossils/fossil_3"),
      alk.b("nether_fossils/fossil_4"),
      alk.b("nether_fossils/fossil_5"),
      alk.b("nether_fossils/fossil_6"),
      alk.b("nether_fossils/fossil_7"),
      alk.b("nether_fossils/fossil_8"),
      alk.b("nether_fossils/fossil_9"),
      alk.b("nether_fossils/fossil_10"),
      alk.b("nether_fossils/fossil_11"),
      alk.b("nether_fossils/fossil_12"),
      alk.b("nether_fossils/fossil_13"),
      alk.b("nether_fossils/fossil_14")
   };

   public static void a(ewg $$0, esi $$1, azz $$2, iw $$3) {
      dty $$4 = dty.a($$2);
      $$1.a(new eul.a($$0, ag.a(a, $$2), $$3, $$4));
   }

   public static class a extends esn {
      public a(ewg $$0, alk $$1, iw $$2, dty $$3) {
         super(esu.ac, 0, $$0, $$1, $$1.toString(), a($$3), $$2);
      }

      public a(ewg $$0, ua $$1) {
         super(esu.ac, $$1, $$0, $$1x -> a($$1.<dty>a("Rot", dty.h).orElseThrow()));
      }

      private static ewb a(dty $$0) {
         return new ewb().a($$0).a(dsh.a).a(evg.d);
      }

      @Override
      protected void a(est $$0, ua $$1) {
         super.a($$0, $$1);
         $$1.a("Rot", dty.h, this.c.d());
      }

      @Override
      protected void a(String $$0, iw $$1, dkq $$2, azz $$3, erv $$4) {
      }

      @Override
      public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
         $$4.b(this.b.b(this.c, this.d));
         super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }
}
