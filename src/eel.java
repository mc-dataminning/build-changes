import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record eel(
   js<dkp> h,
   dir i,
   int j,
   long k,
   long l,
   edr m,
   @Nullable ehv.d n,
   @Nullable egg o,
   edn p,
   @Nullable long[] q,
   Map<egs.a, long[]> r,
   ecq.a s,
   ShortList[] t,
   boolean u,
   List<eel.b> v,
   List<tz> w,
   List<tz> x,
   tz y
) {
   private static final Codec<edi<eat>> z = edi.a(dmr.k, eat.a, edi.d.d, dmt.a.m());
   private static final Codec<List<fgt<dmr>>> A = fgt.a(mg.e.q()).listOf();
   private static final Codec<List<fgt<ewz>>> B = fgt.a(mg.c.q()).listOf();
   private static final Logger C = LogUtils.getLogger();
   private static final String D = "UpgradeData";
   private static final String E = "block_ticks";
   private static final String F = "fluid_ticks";
   public static final String a = "xPos";
   public static final String b = "zPos";
   public static final String c = "Heightmaps";
   public static final String d = "isLightOn";
   public static final String e = "sections";
   public static final String f = "BlockLight";
   public static final String g = "SkyLight";

   @Nullable
   public static eel a(djo $$0, jt $$1, tz $$2) {
      if (!$$2.b("Status", 8)) {
         return null;
      } else {
         dir $$3 = new dir($$2.f("xPos"), $$2.f("zPos"));
         long $$4 = $$2.g("LastUpdate");
         long $$5 = $$2.g("InhabitedTime");
         edr $$6 = $$2.<edr>a("Status", edr.o).orElse(edr.c);
         edn $$7 = $$2.b("UpgradeData", 10) ? new edn($$2.n("UpgradeData"), $$0) : edn.a;
         boolean $$8 = $$2.o("isLightOn");
         ehv.d $$9 = $$2.<ehv.d>a("blending_data", ehv.d.a).orElse(null);
         egg $$10 = $$2.<egg>a("below_zero_retrogen", egg.a).orElse(null);
         long[] $$11;
         if ($$2.b("carving_mask", 12)) {
            $$11 = $$2.m("carving_mask");
         } else {
            $$11 = null;
         }

         tz $$13 = $$2.n("Heightmaps");
         Map<egs.a, long[]> $$14 = new EnumMap<>(egs.a.class);

         for (egs.a $$15 : $$6.e()) {
            String $$16 = $$15.a();
            if ($$13.b($$16, 12)) {
               $$14.put($$15, $$13.m($$16));
            }
         }

         List<fgt<dmr>> $$17 = fgt.a($$2.<List<fgt<dmr>>>a("block_ticks", A).orElse(List.of()), $$3);
         List<fgt<ewz>> $$18 = fgt.a($$2.<List<fgt<ewz>>>a("fluid_ticks", B).orElse(List.of()), $$3);
         ecq.a $$19 = new ecq.a($$17, $$18);
         uf $$20 = $$2.d("PostProcessing", 9);
         ShortList[] $$21 = new ShortList[$$20.size()];

         for (int $$22 = 0; $$22 < $$20.size(); $$22++) {
            uf $$23 = $$20.b($$22);
            ShortList $$24 = new ShortArrayList($$23.size());

            for (int $$25 = 0; $$25 < $$23.size(); $$25++) {
               $$24.add($$23.d($$25));
            }

            $$21[$$22] = $$24;
         }

         List<tz> $$26 = Lists.transform($$2.d("entities", 10), $$0x -> (tz)$$0x);
         List<tz> $$27 = Lists.transform($$2.d("block_entities", 10), $$0x -> (tz)$$0x);
         tz $$28 = $$2.n("structures");
         uf $$29 = $$2.d("sections", 10);
         List<eel.b> $$30 = new ArrayList<>($$29.size());
         js<dkp> $$31 = $$1.f(mh.aG);
         Codec<edj<jf<dkp>>> $$32 = a($$31);

         for (int $$33 = 0; $$33 < $$29.size(); $$33++) {
            tz $$34 = $$29.a($$33);
            int $$35 = $$34.d("Y");
            edb $$40;
            if ($$35 >= $$0.aq() && $$35 <= $$0.ar()) {
               edi<eat> $$36;
               if ($$34.b("block_states", 10)) {
                  $$36 = (edi<eat>)z.parse(un.a, $$34.n("block_states")).promotePartial($$2x -> a($$3, $$35, $$2x)).getOrThrow(eel.a::new);
               } else {
                  $$36 = new edi<>(dmr.k, dmt.a.m(), edi.d.d);
               }

               edj<jf<dkp>> $$38;
               if ($$34.b("biomes", 10)) {
                  $$38 = (edj<jf<dkp>>)$$32.parse(un.a, $$34.n("biomes")).promotePartial($$2x -> a($$3, $$35, $$2x)).getOrThrow(eel.a::new);
               } else {
                  $$38 = new edi<>($$31.t(), $$31.b(dkw.b), edi.d.e);
               }

               $$40 = new edb($$36, $$38);
            } else {
               $$40 = null;
            }

            ecv $$42 = $$34.b("BlockLight", 7) ? new ecv($$34.k("BlockLight")) : null;
            ecv $$43 = $$34.b("SkyLight", 7) ? new ecv($$34.k("SkyLight")) : null;
            $$30.add(new eel.b($$35, $$40, $$42, $$43));
         }

         return new eel($$31, $$3, $$0.aq(), $$4, $$5, $$6, $$9, $$10, $$7, $$11, $$14, $$19, $$21, $$8, $$30, $$26, $$27, $$28);
      }
   }

   public edk a(arq $$0, cil $$1, eej $$2, dir $$3) {
      if (!Objects.equals($$3, this.i)) {
         C.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{$$3, $$3, this.i});
         $$0.p().a(this.i, $$3, $$2);
      }

      int $$4 = $$0.ap();
      edb[] $$5 = new edb[$$4];
      boolean $$6 = $$0.B_().g();
      ecu $$7 = $$0.m();
      ewp $$8 = $$7.q();
      js<dkp> $$9 = $$0.F_().f(mh.aG);
      boolean $$10 = false;

      for (eel.b $$11 : this.v) {
         jy $$12 = jy.a($$3, $$11.a);
         if ($$11.b != null) {
            $$5[$$0.g($$11.a)] = $$11.b;
            $$1.a($$12, $$11.b);
         }

         boolean $$13 = $$11.c != null;
         boolean $$14 = $$6 && $$11.d != null;
         if ($$13 || $$14) {
            if (!$$10) {
               $$8.b($$3, true);
               $$10 = true;
            }

            if ($$13) {
               $$8.a(djv.b, $$12, $$11.c);
            }

            if ($$14) {
               $$8.a(djv.a, $$12, $$11.d);
            }
         }
      }

      edv $$15 = this.m.d();
      ecq $$18;
      if ($$15 == edv.b) {
         fgp<dmr> $$16 = new fgp<>(this.s.a());
         fgp<ewz> $$17 = new fgp<>(this.s.b());
         $$18 = new eda($$0.a(), $$3, this.p, $$16, $$17, this.l, $$5, a($$0, this.w, this.x), ehv.a(this.n));
      } else {
         fgs<dmr> $$19 = fgs.a(this.s.a());
         fgs<ewz> $$20 = fgs.a(this.s.b());
         edk $$21 = new edk($$3, this.p, $$5, $$19, $$20, $$0, $$9, ehv.a(this.n));
         $$18 = $$21;
         $$21.c(this.l);
         if (this.o != null) {
            $$21.a(this.o);
         }

         $$21.a(this.m);
         if (this.m.a(edr.k)) {
            $$21.a($$8);
         }
      }

      $$18.a(this.u);
      EnumSet<egs.a> $$23 = EnumSet.noneOf(egs.a.class);

      for (egs.a $$24 : $$18.n().e()) {
         long[] $$25 = this.r.get($$24);
         if ($$25 != null) {
            $$18.a($$24, $$25);
         } else {
            $$23.add($$24);
         }
      }

      egs.a($$18, $$23);
      $$18.a(a(esd.a($$0), this.y, $$0.E()));
      $$18.b(a($$0.F_(), $$3, this.y));

      for (int $$26 = 0; $$26 < this.t.length; $$26++) {
         $$18.a(this.t[$$26], $$26);
      }

      if ($$15 == edv.b) {
         return new ecz((eda)$$18, false);
      } else {
         edk $$27 = (edk)$$18;

         for (tz $$28 : this.w) {
            $$27.b($$28);
         }

         for (tz $$29 : this.x) {
            $$27.a($$29);
         }

         if (this.q != null) {
            $$27.a(new ecp(this.q, $$18.G_()));
         }

         return $$27;
      }
   }

   private static void a(dir $$0, int $$1, String $$2) {
      C.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{$$0.h, $$1, $$0.i, $$2});
   }

   private static Codec<edj<jf<dkp>>> a(js<dkp> $$0) {
      return edi.b($$0.t(), $$0.r(), edi.d.e, $$0.b(dkw.b));
   }

   public static eel a(arq $$0, ecq $$1) {
      if (!$$1.s()) {
         throw new IllegalArgumentException("Chunk can't be serialized: " + $$1);
      } else {
         dir $$2 = $$1.f();
         List<eel.b> $$3 = new ArrayList<>();
         edb[] $$4 = $$1.d();
         ewp $$5 = $$0.m().a();

         for (int $$6 = $$5.d(); $$6 < $$5.e(); $$6++) {
            int $$7 = $$1.g($$6);
            boolean $$8 = $$7 >= 0 && $$7 < $$4.length;
            ecv $$9 = $$5.a(djv.b).a(jy.a($$2, $$6));
            ecv $$10 = $$5.a(djv.a).a(jy.a($$2, $$6));
            ecv $$11 = $$9 != null && !$$9.d() ? $$9.b() : null;
            ecv $$12 = $$10 != null && !$$10.d() ? $$10.b() : null;
            if ($$8 || $$11 != null || $$12 != null) {
               edb $$13 = $$8 ? $$4[$$7].k() : null;
               $$3.add(new eel.b($$6, $$13, $$11, $$12));
            }
         }

         List<tz> $$14 = new ArrayList<>($$1.c().size());

         for (iv $$15 : $$1.c()) {
            tz $$16 = $$1.a($$15, $$0.F_());
            if ($$16 != null) {
               $$14.add($$16);
            }
         }

         List<tz> $$17 = new ArrayList<>();
         long[] $$18 = null;
         if ($$1.n().d() == edv.a) {
            edk $$19 = (edk)$$1;
            $$17.addAll($$19.I());
            ecp $$20 = $$19.E();
            if ($$20 != null) {
               $$18 = $$20.a();
            }
         }

         Map<egs.a, long[]> $$21 = new EnumMap<>(egs.a.class);

         for (Entry<egs.a, egs> $$22 : $$1.e()) {
            if ($$1.n().e().contains($$22.getKey())) {
               long[] $$23 = $$22.getValue().a();
               $$21.put($$22.getKey(), (long[])$$23.clone());
            }
         }

         ecq.a $$24 = $$1.a($$0.ae());
         ShortList[] $$25 = Arrays.stream($$1.p()).map($$0x -> $$0x != null ? new ShortArrayList($$0x) : null).toArray(ShortList[]::new);
         tz $$26 = a(esd.a($$0), $$2, $$1.g(), $$1.h());
         return new eel(
            $$0.F_().f(mh.aG),
            $$2,
            $$1.aq(),
            $$0.ae(),
            $$1.w(),
            $$1.n(),
            y.a($$1.v(), ehv::a),
            $$1.z(),
            $$1.t().c(),
            $$18,
            $$21,
            $$24,
            $$25,
            $$1.x(),
            $$3,
            $$17,
            $$14,
            $$26
         );
      }
   }

   public tz a() {
      tz $$0 = uo.e(new tz());
      $$0.a("xPos", this.i.h);
      $$0.a("yPos", this.j);
      $$0.a("zPos", this.i.i);
      $$0.a("LastUpdate", this.k);
      $$0.a("InhabitedTime", this.l);
      $$0.a("Status", mg.l.b(this.m).toString());
      $$0.b("blending_data", ehv.d.a, this.n);
      $$0.b("below_zero_retrogen", egg.a, this.o);
      if (!this.p.a()) {
         $$0.a("UpgradeData", this.p.b());
      }

      uf $$1 = new uf();
      Codec<edj<jf<dkp>>> $$2 = a(this.h);

      for (eel.b $$3 : this.v) {
         tz $$4 = new tz();
         edb $$5 = $$3.b;
         if ($$5 != null) {
            $$4.a("block_states", z, $$5.h());
            $$4.a("biomes", $$2, $$5.i());
         }

         if ($$3.c != null) {
            $$4.a("BlockLight", $$3.c.a());
         }

         if ($$3.d != null) {
            $$4.a("SkyLight", $$3.d.a());
         }

         if (!$$4.g()) {
            $$4.a("Y", (byte)$$3.a);
            $$1.add($$4);
         }
      }

      $$0.a("sections", $$1);
      if (this.u) {
         $$0.a("isLightOn", true);
      }

      uf $$6 = new uf();
      $$6.addAll(this.x);
      $$0.a("block_entities", $$6);
      if (this.m.d() == edv.a) {
         uf $$7 = new uf();
         $$7.addAll(this.w);
         $$0.a("entities", $$7);
         if (this.q != null) {
            $$0.a("carving_mask", this.q);
         }
      }

      a($$0, this.s);
      $$0.a("PostProcessing", a(this.t));
      tz $$8 = new tz();
      this.r.forEach(($$1x, $$2x) -> $$8.a($$1x.a(), new ug($$2x)));
      $$0.a("Heightmaps", $$8);
      $$0.a("structures", this.y);
      return $$0;
   }

   private static void a(tz $$0, ecq.a $$1) {
      $$0.a("block_ticks", A, $$1.a());
      $$0.a("fluid_ticks", B, $$1.b());
   }

   public static edr a(@Nullable tz $$0) {
      return $$0 != null ? $$0.<edr>a("Status", edr.o).orElse(edr.c) : edr.c;
   }

   @Nullable
   private static eda.c a(arq $$0, List<tz> $$1, List<tz> $$2) {
      return $$1.isEmpty() && $$2.isEmpty() ? null : $$3 -> {
         if (!$$1.isEmpty()) {
            $$0.a(bwr.a($$1, $$0, bwq.r));
         }

         for (tz $$4 : $$2) {
            boolean $$5 = $$4.o("keepPacked");
            if ($$5) {
               $$3.a($$4);
            } else {
               iv $$6 = dxr.b($$4);
               dxr $$7 = dxr.a($$6, $$3.a_($$6), $$4, $$0.F_());
               if ($$7 != null) {
                  $$3.a($$7);
               }
            }
         }
      };
   }

   private static tz a(esd $$0, dir $$1, Map<ern, erv> $$2, Map<ern, LongSet> $$3) {
      tz $$4 = new tz();
      tz $$5 = new tz();
      js<ern> $$6 = $$0.b().f(mh.be);

      for (Entry<ern, erv> $$7 : $$2.entrySet()) {
         alg $$8 = $$6.b($$7.getKey());
         $$5.a($$8.toString(), $$7.getValue().a($$0, $$1));
      }

      $$4.a("starts", $$5);
      tz $$9 = new tz();

      for (Entry<ern, LongSet> $$10 : $$3.entrySet()) {
         if (!$$10.getValue().isEmpty()) {
            alg $$11 = $$6.b($$10.getKey());
            $$9.a($$11.toString(), new ug($$10.getValue()));
         }
      }

      $$4.a("References", $$9);
      return $$4;
   }

   private static Map<ern, erv> a(esd $$0, tz $$1, long $$2) {
      Map<ern, erv> $$3 = Maps.newHashMap();
      js<ern> $$4 = $$0.b().f(mh.be);
      tz $$5 = $$1.n("starts");

      for (String $$6 : $$5.e()) {
         alg $$7 = alg.c($$6);
         ern $$8 = $$4.a($$7);
         if ($$8 == null) {
            C.error("Unknown structure start: {}", $$7);
         } else {
            erv $$9 = erv.a($$0, $$5.n($$6), $$2);
            if ($$9 != null) {
               $$3.put($$8, $$9);
            }
         }
      }

      return $$3;
   }

   private static Map<ern, LongSet> a(jt $$0, dir $$1, tz $$2) {
      Map<ern, LongSet> $$3 = Maps.newHashMap();
      js<ern> $$4 = $$0.f(mh.be);
      tz $$5 = $$2.n("References");

      for (String $$6 : $$5.e()) {
         alg $$7 = alg.c($$6);
         ern $$8 = $$4.a($$7);
         if ($$8 == null) {
            C.warn("Found reference to unknown structure '{}' in chunk {}, discarding", $$7, $$1);
         } else {
            long[] $$9 = $$5.m($$6);
            if ($$9.length != 0) {
               $$3.put($$8, new LongOpenHashSet(Arrays.stream($$9).filter($$2x -> {
                  dir $$3x = new dir($$2x);
                  if ($$3x.a($$1) > 8) {
                     C.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", new Object[]{$$7, $$3x, $$1});
                     return false;
                  } else {
                     return true;
                  }
               }).toArray()));
            }
         }
      }

      return $$3;
   }

   private static uf a(ShortList[] $$0) {
      uf $$1 = new uf();

      for (ShortList $$2 : $$0) {
         uf $$3 = new uf();
         if ($$2 != null) {
            for (int $$4 = 0; $$4 < $$2.size(); $$4++) {
               $$3.add(ur.a($$2.getShort($$4)));
            }
         }

         $$1.add($$3);
      }

      return $$1;
   }

   public js<dkp> b() {
      return this.h;
   }

   public dir c() {
      return this.i;
   }

   public int d() {
      return this.j;
   }

   public long e() {
      return this.k;
   }

   public long f() {
      return this.l;
   }

   public edr g() {
      return this.m;
   }

   @Nullable
   public ehv.d h() {
      return this.n;
   }

   @Nullable
   public egg i() {
      return this.o;
   }

   public edn j() {
      return this.p;
   }

   @Nullable
   public long[] k() {
      return this.q;
   }

   public Map<egs.a, long[]> l() {
      return this.r;
   }

   public ecq.a m() {
      return this.s;
   }

   public ShortList[] n() {
      return this.t;
   }

   public boolean o() {
      return this.u;
   }

   public List<eel.b> p() {
      return this.v;
   }

   public List<tz> q() {
      return this.w;
   }

   public List<tz> r() {
      return this.x;
   }

   public tz s() {
      return this.y;
   }

   public static class a extends uk {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(int a, @Nullable edb b, @Nullable ecv c, @Nullable ecv d) {
   }
}
