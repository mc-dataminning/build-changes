import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.function.Supplier;

public enum cin implements aub, cim {
   a("leather", 5, ac.a(new EnumMap<>(cil.a.class), $$0 -> {
      $$0.put(cil.a.d, 1);
      $$0.put(cil.a.c, 2);
      $$0.put(cil.a.b, 3);
      $$0.put(cil.a.a, 1);
   }), 15, aqn.ai, 0.0F, 0.0F, () -> coc.a(cle.pP)),
   b("chainmail", 15, ac.a(new EnumMap<>(cil.a.class), $$0 -> {
      $$0.put(cil.a.d, 1);
      $$0.put(cil.a.c, 4);
      $$0.put(cil.a.b, 5);
      $$0.put(cil.a.a, 2);
   }), 12, aqn.ac, 0.0F, 0.0F, () -> coc.a(cle.nQ)),
   c("iron", 15, ac.a(new EnumMap<>(cil.a.class), $$0 -> {
      $$0.put(cil.a.d, 2);
      $$0.put(cil.a.c, 5);
      $$0.put(cil.a.b, 6);
      $$0.put(cil.a.a, 2);
   }), 9, aqn.ah, 0.0F, 0.0F, () -> coc.a(cle.nQ)),
   d("gold", 7, ac.a(new EnumMap<>(cil.a.class), $$0 -> {
      $$0.put(cil.a.d, 1);
      $$0.put(cil.a.c, 3);
      $$0.put(cil.a.b, 5);
      $$0.put(cil.a.a, 2);
   }), 25, aqn.ag, 0.0F, 0.0F, () -> coc.a(cle.nU)),
   e("diamond", 33, ac.a(new EnumMap<>(cil.a.class), $$0 -> {
      $$0.put(cil.a.d, 3);
      $$0.put(cil.a.c, 6);
      $$0.put(cil.a.b, 8);
      $$0.put(cil.a.a, 3);
   }), 10, aqn.ad, 2.0F, 0.0F, () -> coc.a(cle.nK)),
   f("turtle", 25, ac.a(new EnumMap<>(cil.a.class), $$0 -> {
      $$0.put(cil.a.d, 2);
      $$0.put(cil.a.c, 5);
      $$0.put(cil.a.b, 6);
      $$0.put(cil.a.a, 2);
   }), 9, aqn.ak, 0.0F, 0.0F, () -> coc.a(cle.nD)),
   g("netherite", 37, ac.a(new EnumMap<>(cil.a.class), $$0 -> {
      $$0.put(cil.a.d, 3);
      $$0.put(cil.a.c, 6);
      $$0.put(cil.a.b, 8);
      $$0.put(cil.a.a, 3);
   }), 15, aqn.aj, 3.0F, 0.1F, () -> coc.a(cle.nV));

   public static final Codec<cin> h = aub.a(cin::values);
   private static final EnumMap<cil.a, Integer> i = ac.a(new EnumMap<>(cil.a.class), $$0 -> {
      $$0.put(cil.a.d, 13);
      $$0.put(cil.a.c, 15);
      $$0.put(cil.a.b, 16);
      $$0.put(cil.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<cil.a, Integer> l;
   private final int m;
   private final aqm n;
   private final float o;
   private final float p;
   private final atd<coc> q;

   private cin(String $$0, int $$1, EnumMap<cil.a, Integer> $$2, int $$3, aqm $$4, float $$5, float $$6, Supplier<coc> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new atd<>($$7);
   }

   @Override
   public int a(cil.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(cil.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public aqm b() {
      return this.n;
   }

   @Override
   public coc d() {
      return this.q.a();
   }

   @Override
   public String e() {
      return this.j;
   }

   @Override
   public float f() {
      return this.o;
   }

   @Override
   public float g() {
      return this.p;
   }

   @Override
   public String c() {
      return this.j;
   }
}
