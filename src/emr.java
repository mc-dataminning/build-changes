import com.mojang.serialization.MapCodec;

public interface emr<S extends emi> {
   emr<eoc> a = a("buried_treasure", eoc.d);
   emr<eoe> b = a("desert_pyramid", eoe.d);
   emr<eog> c = a("end_city", eog.d);
   emr<eop> d = a("fortress", eop.e);
   emr<eoi> e = a("igloo", eoi.d);
   emr<eoj> f = a("jigsaw", eoj.i);
   emr<eol> g = a("jungle_temple", eol.d);
   emr<eon> h = a("mineshaft", eon.d);
   emr<eor> i = a("nether_fossil", eor.d);
   emr<eot> j = a("ocean_monument", eot.d);
   emr<eov> k = a("ocean_ruin", eov.d);
   emr<eox> l = a("ruined_portal", eox.d);
   emr<eoz> m = a("shipwreck", eoz.d);
   emr<epb> n = a("stronghold", epb.d);
   emr<epd> o = a("swamp_hut", epd.d);
   emr<epf> p = a("woodland_mansion", epf.d);

   MapCodec<S> codec();

   private static <S extends emi> emr<S> a(String $$0, MapCodec<S> $$1) {
      return kd.a(lz.R, $$0, () -> $$1);
   }
}
